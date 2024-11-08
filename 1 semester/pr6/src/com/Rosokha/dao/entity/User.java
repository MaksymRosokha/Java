package com.Rosokha.dao.entity;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * Клас, у якому реалізований користувач
 */
public class User {

    /**
     * Шлях до текстового документу з логінами і паролями
     */
    private static final String PATH_TO_USERS = "Data\\Users\\Users.txt";

    /**
     * Список всіх логінів користувачів
     * @see User#getLogins()
     */
    private static ArrayList<String> logins = new ArrayList<>();

    /**
     * Список всіх хешованих паролів користувачів
     * @see User#getPasswords()
     */
    private static ArrayList<String> passwords = new ArrayList<>();

    /**
     * відповідає за те, чи вже здійснений вхід користувачем
     * @see User#getIsUser()
     * @see User#setIsUser(boolean)
     */
    private static boolean isUser = false;

    /**
     * Логін користувача
     * @see User#getLogin()
     * @see User#setLogin(String)
     */
    private static String login;

    /**
     * Пароль користувача
     * @see User#setPassword(String)
     */
    private static String password;

    /**
     * Сеттер для isUser
     * @param isUser встановлює значення для статичного поля isUser
     * @see User#isUser
     */
    public static void setIsUser(boolean isUser) {
        User.isUser = isUser;
    }

    /**
     * Геттер для isUser
     * @return повертає значення статичного поля isUser
     * @see User#isUser
     */
    public static boolean getIsUser() {
        return isUser;
    }

    /**
     * Сеттер для пароля користувача
     * @param password встановлює значення для статичного поля password
     * @see User#passwords
     */
    public static void setPassword(String password) {
        User.password = password;
    }

    /**
     * Геттер для статичного поля logins
     * @return повертає статичне поле logins
     * @see User#logins
     */
    public static ArrayList<String> getLogins() {
        return logins;
    }

    /**
     * Геттер для статичного поля passwords
     * @return повертає статичне поле passwords
     * @see User#passwords
     */
    public static ArrayList<String> getPasswords() {
        return passwords;
    }

    /**
     * Геттер для статичного поля login
     * @return повертає статичне поле login
     * @see User#login
     */
    public static String getLogin() {
        return login;
    }

    /**
     * Сеттер для статичного поля login
     * @param login встановлює значення для статичного поля login
     * @see User#login
     */
    public static void setLogin(String login) {
        User.login = login;
    }

    /**
     * Створює список логінів і список паролів
     * @see User#logins
     * @see User#passwords
     * @see File
     * @see FileReader
     * @see BufferedReader
     */
    public static void makListsOfLoginsAndPasswords() {
        logins.clear();
        passwords.clear();

        File file = new File(PATH_TO_USERS);

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String[] loginAndPassword = new String[2];
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                loginAndPassword = line.split("==");

                logins.add(loginAndPassword[0]);
                passwords.add(loginAndPassword[1]);
            }

            bufferedReader.close();

        } catch (Exception ex) {}
    }

    /**
     * Створює нового користувача
     * @param login логін, який потрібно записати
     * @param password пароль, який потрібно записати
     * @throws IOException виняток
     * @see File
     * @see FileWriter
     * @see BufferedReader
     */
    public static void addUser(String login, String password) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(PATH_TO_USERS);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
        } catch (Exception ex) {
            return;
        }

        fileWriter.write("\n" + login + "==" + password);
        fileWriter.close();

        User.login = login;
        User.password = password;
    }
}
