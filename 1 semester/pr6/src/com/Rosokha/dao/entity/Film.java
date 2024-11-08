package com.Rosokha.dao.entity;

import java.io.File;
import java.util.ArrayList;

/**
 * Клас, у якому реалізований фільм
 */
public class Film {

    /**
     * Шлях до текстових документів з фільмами
     */
    private static final String PATH_TO_FILMS = "Data\\Films\\";

    /**
     * Список фільмів
     * @see Film#getFilms()
     */
    private static ArrayList<File> films = new ArrayList<>();

    /**
     * Геттер для статичного поля films
     * @return повертає статичне поле films
     * @see Film#films
     */
    public static ArrayList<File> getFilms() {
        return films;
    }

    /**
     * Заповнює список фільмів
     *
     * @return повертає true якщо вдалося знайти файли, якщо ні то false
     * @see File
     * @see File#listFiles()
     */
    public static boolean makeListOfFilms() {
        File file = new File(PATH_TO_FILMS);

        if (file.listFiles() != null) {
            for (File s : file.listFiles()) {
                if (s.isFile()) {
                    films.add(s);
                }
            }
            return true;
        } else {
            return false;
        }
    }
}