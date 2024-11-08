package com.Rosokha.bl;

import com.Rosokha.dao.entity.User;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Клас, який здійснює реєстрація користувача
 */
public class Registration {

    /**
     * Реєструє користувача
     * @param login логін, який увів користувач для реєтрування
     * @param password пароль, який увів користувач для реєтрування
     * @return повертає true якщо вдалося зареєструвати користувача, false якщо не вдалося
     * @throws NoSuchAlgorithmException виняток
     * @throws IOException виняток
     * @see Registration#loginCheck(String)
     * @see Registration#hashPassword(String)
     */
    public static boolean registration(String login, String password) throws NoSuchAlgorithmException, IOException {
        if(loginCheck(login) == true){
            User.addUser(login, hashPassword(password));
            User.makListsOfLoginsAndPasswords();
            LogIn.logIn(login, password);

            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Перевіряє, чи уведений логін не збігається з уже наявними логінами, і чи в уведеному логіні є символ "="
     * @param login логін, який увів користувач для реєтрування
     * @return повертає true якщо логін не збігається з уже наявними логінами, і не має символ "=", інакше false
     * @see User#getLogins()
     */
    private static boolean loginCheck(String login) {

        for(String log : User.getLogins()){
            if(login.equals(log)){
                return false;
            }
        }
        for(char ch : login.toCharArray()){
            if(ch == '='){
                return false;
            }
        }

        return true;
    }

    /**
     * Хешує пароль методом "SHA-1"
     * @param password пароль, який потрібно хешувати
     * @return повертає захешований пароль
     * @throws NoSuchAlgorithmException виняток
     * @see MessageDigest
     * @see MessageDigest#digest(byte[])
     * @see StringBuilder
     * @see StringBuilder#append(int)
     */
    public static String hashPassword(String password) throws NoSuchAlgorithmException {

        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        byte [] bytes = sha1.digest(password.getBytes());

        StringBuilder stringBuilder = new StringBuilder();
        for(byte b : bytes){
            stringBuilder.append(String.format("%02X", b));
        }

        return stringBuilder.toString();
    }
}
