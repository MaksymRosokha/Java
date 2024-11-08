package com.Rosokha.Interface;

import com.Rosokha.bl.LogIn;
import com.Rosokha.bl.Registration;
import com.Rosokha.dao.entity.Film;
import com.Rosokha.dao.entity.Response;
import com.Rosokha.dao.entity.User;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *Реалізує меню, та взаємодію з користувачем
 */
public class Menu {

    /**
     * Реалізує головне меню користувача
     * @throws IOException виняток
     * @throws NoSuchAlgorithmException виняток
     * @see BufferedReader
     */
    public static void mainMenu() throws IOException, NoSuchAlgorithmException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;

        while (true) {
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
            System.out.println("\t- - - Книга відгуків кінотеатру - - -\n");
            System.out.print(ConsoleColors.CYAN_BOLD_BRIGHT);

            if (User.getIsUser() == false) {
                System.out.print("1 — Вхід\n" +
                        "2 — Реєстрація\n" +
                        "3 — Переглянути відгуки\n" +
                        "0 — Вихід\n" +
                        "Команда: ");
                try {
                    input = Integer.parseInt(in.readLine());
                    System.out.println("\n");
                } catch (Exception ex) {
                    System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
                    System.out.println("Помилка\n\n");
                    continue;
                }

                switch (input) {
                    case 1: {
                        logIn();
                        continue;
                    }
                    case 2: {
                        registration();
                        continue;
                    }
                    case 3: {
                        showFilms();
                        readResponse(Response.selectedResponse(selectedFilm()));
                        continue;
                    }
                    case 0: {
                        System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
                        System.out.println("Допобачення");
                        System.exit(0);
                    }
                    default: {
                        System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
                        System.out.println("Помилка\n\n");
                        continue;
                    }

                }
            } else {
                System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT + "Login: " + User.getLogin() + "\n" + ConsoleColors.GREEN_BOLD_BRIGHT +
                        "1 — Додати відгук\n" +
                        "2 — Переглянути відгуки\n" +
                        "0 — Вихід\n" +
                        "Команда: ");
                try {
                    input = Integer.parseInt(in.readLine());
                    System.out.println("\n");
                } catch (Exception ex) {
                    System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
                    System.out.println("Помилка\n\n");
                    continue;
                }

                switch (input) {
                    case 1:{
                        showFilms();
                        Response.writeResponse(selectedFilm(), writeResponse());
                        continue;
                    }
                    case 2: {
                        showFilms();
                        readResponse(Response.selectedResponse(selectedFilm()));
                        continue;
                    }
                    case 0: {
                        System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
                        System.out.println("Допобачення");
                        System.exit(0);
                    }
                    default: {
                        System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
                        System.out.println("Помилка\n\n");
                        continue;
                    }
                }
            }
        }
    }

    /**
     * Реалізує інтерфейс реєстрування
     * @throws IOException виняток
     * @throws NoSuchAlgorithmException виняток
     * @see Registration#registration(String, String)
     * @see BufferedReader
     */
    private static void registration() throws IOException, NoSuchAlgorithmException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        String login, password;

        System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
        System.out.print("Введіть логін: ");
        login = in.readLine();
        System.out.print("Введіть пароль: ");
        password = in.readLine();

        if (Registration.registration(login, password) == true) {
            System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
            System.out.println("Користувач успішно створений\n\n");
        } else {
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
            System.out.println("Не вдалося створити користувача.\n\n");
        }
    }

    /**
     * Реалізує інтерфейс входу
     * @throws IOException виняток
     * @throws NoSuchAlgorithmException виняток
     * @see LogIn#logIn(String, String)
     * @see BufferedReader
     */
    private static void logIn() throws IOException, NoSuchAlgorithmException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        String login, password;

        System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
        System.out.print("Введіть логін: ");
        login = in.readLine();
        System.out.print("Введіть пароль: ");
        password = in.readLine();

        if (LogIn.logIn(login, password) == true) {
            System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
            System.out.println("Вхід успішно здійснений\n\n");
        } else {
            System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
            System.out.println("Не вдалося увійти.\n\n");
        }
    }

    /**
     * Показує список фільмів користувачеві
     * @throws IOException виняток
     * @see Film#getFilms()
     * @see File
     */
    private static void showFilms() throws IOException {
        int i = 0;

        System.out.print(ConsoleColors.BLUE_BOLD_BRIGHT);
        for (File film: Film.getFilms()) {
            System.out.println(i + " — " + film.getName().substring(0, film.getName().length() - 4));
            i++;
        }
    }

    /**
     * Реалізує інтерфейс для визначення фільму, який вибрав користувач
     *
     * @return повертає індекс вибраниого фільму
     * @throws IOException виняток
     * @see Film
     * @see Film#getFilms()
     * @see BufferedReader
     */
    public static int selectedFilm() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;

        do {
            System.out.print(ConsoleColors.PURPLE_BOLD_BRIGHT);
            System.out.print("Виберіть фільм: ");
            try {
                index = Integer.parseInt(in.readLine());
                System.out.println("");
            } catch (Exception ex) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT);
                System.out.println("Помилка! Не правильно введена команда. Спробуйте ще раз.\n");
                continue;
            }

            if (index < Film.getFilms().size() && index >= 0) {
                break;
            } else {
                System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
                System.out.println("Помилка! Не правильно введене число. Спробуйте ще раз.\n");
                continue;
            }
        } while (true);

        return index;
    }

    /**
     * Виводить на екран всі відгуки, по вибраному фільму
     * @param response вміст файлу з відгуком
     * @see Response
     * @see Response#selectedResponse(int)
     */
    private static void readResponse(ArrayList<String> response){
        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        for (String s : response){
            System.out.println(s);
        }
    }

    /**
     * Реалізує інтерфейс для написання відгуку
     * @return повертає написаний користувачем відгук
     * @throws IOException виняток
     * @see Response
     * @see Response#writeResponse(int, String)
     */
    private static String writeResponse() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(ConsoleColors.BLUE_BOLD_BRIGHT);
        System.out.println("Напишіть відгук!");

        return in.readLine();
    }
}
