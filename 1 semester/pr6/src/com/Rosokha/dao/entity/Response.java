package com.Rosokha.dao.entity;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.ArrayList;

/**
 * Клас, у якому реалізований відгук
 */
public class Response {

    /**
     * Шлях до текстових документів з відгуками
     */
    private static final String PATH_TO_RESPONSES = "Data\\Responses\\";

    /**
     * Список відгуків, до кожного фільму
     */
    private static ArrayList<File> responses = new ArrayList<>();

    /**
     * Заповнює список відгуків
     * @return повертає true якщо вдалося знайти файли, якщо ні то false
     * @see File
     * @see File#listFiles()
     * @see Response#responses
     */
    public static boolean makeListOfResponses() {
        File file = new File(PATH_TO_RESPONSES);

        if (file.listFiles() != null) {
            for (File s : file.listFiles()) {
                if (s.isFile()) {
                    responses.add(s);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Записує відгуки з вибраного текстового документу
     * @param index індекс фільму, з якого потрібно подивитися відгуки
     * @return повертає всі відгуки по заданому фільму
     * @see File
     * @see FileReader
     * @see BufferedReader
     */
    public static ArrayList<String> selectedResponse(int index) {

        File file = responses.get(index);
        ArrayList<String> response = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                response.add(line);
            }

            bufferedReader.close();
            fileReader.close();

        } catch (Exception ex) {}

        return response;
    }

    /**
     * Записує відгук у заданий текстовий документ
     * @param index індекс фільму, до якого потрібно записати відгук
     * @param text текст, який потрібно записати
     * @throws IOException виняток
     * @see BufferedReader
     * @see File
     * @see FileWriter
     * @see FileWriter#write(String) 
     * @see Date
     */
    public static void writeResponse(int index, String text) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        File file = responses.get(index);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
        } catch (Exception ex) {
            return;
        }

        Date date = new Date();
        fileWriter.write("\n\nАвтор: " + User.getLogin() +
                "\nДата написання: " + date +
                "\nВідгук:\n" + text);

        fileWriter.close();
    }
}
