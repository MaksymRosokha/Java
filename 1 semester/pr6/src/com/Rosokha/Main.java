package com.Rosokha;

import com.Rosokha.Interface.Menu;
import com.Rosokha.dao.entity.Film;
import com.Rosokha.dao.entity.Response;
import com.Rosokha.dao.entity.User;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Головний клас програми
 */
public class Main {

    /**
     * Точка входу у програму.
     *
     * @param args аргументи, що надійшли з командного рядка
     * @throws IOException виняток
     * @throws NoSuchAlgorithmException виняток
     */
    public static void main(String [] args) throws IOException, NoSuchAlgorithmException {
        User.makListsOfLoginsAndPasswords();
        Film.makeListOfFilms();
        Response.makeListOfResponses();

        Menu.mainMenu();
    }
}
