/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package working.with.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Maksim
 */
public class ConnectorWithDatabase {
    
    private static final String CP="utf8";
    private static Connection conn = null; //обєкт що представляє зєднання з БД    
    
    
    public static boolean doConnect(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("sql11497417");
        dataSource.setPassword("B91UsZJJch");
        dataSource.setServerName("sql11.freemysqlhosting.net");     
        dataSource.setDatabaseName("sql11497417");
        dataSource.setPort(3306); 
        
        try {
            dataSource.setServerTimezone("UTC");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Помилка під час встановлення часового поясу до бази даних", "Помилка", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            dataSource.setCharacterEncoding(CP);
        } catch (SQLException ex) {
            System.out.println("Err on setting CP :\n"+ex.toString());
            JOptionPane.showMessageDialog(null, "Помилка під час встановлення кодування до бази даних", "Помилка", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            conn=dataSource.getConnection();
        } catch (SQLException ex) {
            conn=null;
            JOptionPane.showMessageDialog(null, "Помилка під час встановлення з'єднання з базою даних", "Помилка", JOptionPane.ERROR_MESSAGE);
            return false;
        }  
        JOptionPane.showMessageDialog(null, "ПІДКЛЮЧЕНО", "Помилка", JOptionPane.ERROR_MESSAGE);
        return true;
    }

    public static Connection getConn() {
        return conn;
    }
}
