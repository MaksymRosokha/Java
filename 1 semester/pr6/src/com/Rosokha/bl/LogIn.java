package com.Rosokha.bl;

import com.Rosokha.dao.entity.User;

import java.security.NoSuchAlgorithmException;

/**
 * Клас для входу користувача
 */
public class LogIn {

    /**
     * Виконує вхід користувача
     * @param login логін, який увів користувач для входу
     * @param password пароль, який увів користувач для входу
     * @return повертає true якщо вдалося здійснити вхід, false якщо не вдалося
     * @throws NoSuchAlgorithmException виняток
     * @see User#getLogins()
     * @see User#getPasswords()
     * @see Registration#hashPassword(String)
     * @see User#setLogin(String)
     * @see User#setPassword(String)
     * @see User#setIsUser(boolean)
     */
    public static boolean logIn(String login, String password) throws NoSuchAlgorithmException {

        int indexLogin = -1;

        for(int i = 0; i < User.getLogins().size(); i++){
            if(login.equals(User.getLogins().get(i))){
                indexLogin = i;
                break;
            }
        }

        if(indexLogin == -1){
            return false;
        }
        else{
            password = Registration.hashPassword(password);

            if(User.getPasswords().get(indexLogin).equals(password)){

                User.setLogin(User.getLogins().get(indexLogin));
                User.setPassword(User.getPasswords().get(indexLogin));
                User.setIsUser(true);
                return true;
            }
            else{
                return false;
            }
        }
    }
}
