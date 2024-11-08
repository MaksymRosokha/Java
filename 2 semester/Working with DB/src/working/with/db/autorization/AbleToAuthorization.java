/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package working.with.db.autorization;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Maksim
 */
public interface AbleToAuthorization {
    default String hashPassword(String password){
        MessageDigest sha1 = null;
        try {
            sha1 = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException ex) {
            showMessageDialog(null, "Помилка алгоритму хешування пароля" ,"Error", JOptionPane.ERROR_MESSAGE);
            return password;
        }
        byte [] bytes = sha1.digest(password.getBytes());

        StringBuilder stringBuilder = new StringBuilder();
        for(byte b : bytes){
            stringBuilder.append(String.format("%02X", b));
        }

        return stringBuilder.toString();
    }
}
