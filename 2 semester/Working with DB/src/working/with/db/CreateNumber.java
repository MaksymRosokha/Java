/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package working.with.db;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Maksim
 */
public class CreateNumber extends javax.swing.JInternalFrame {

    private Connection conn;
    
    /**
     * Creates new form CreatorOfNewNumbers
     */
    public CreateNumber() {
        initComponents();
        conn = ConnectorWithDatabase.getConn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Додати номер телефону");

        pnlBackground.setBackground(new java.awt.Color(204, 204, 255));

        btnCreate.setBackground(new java.awt.Color(0, 51, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCreate.setText("Створити");
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblNumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 0, 255));
        lblNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumber.setText("Номер:");

        txtNumber.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumber)
                    .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(lblNumber)
                .addGap(5, 5, 5)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(txtNumber.getText().length() > 15){
            JOptionPane.showMessageDialog(rootPane, "Номер не може бути довшим за 15 символів", "Помилка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(txtNumber.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Номер не повинен бути меншим за 1 символ", "Помилка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        createNumber();
    }//GEN-LAST:event_btnCreateActionPerformed

        private boolean createNumber(){
            String SQL = "INSERT INTO user_numbers (phone, id_user) VALUES (?,?);";
            PreparedStatement st = null;

            try{
                st = conn.prepareStatement(SQL);
                st.setString(1, txtNumber.getText());
                st.setString(2, PhoneDirectory.getUser().getId()+"");
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Помилка під час встановлення з'єднання з базою даних", "Помилка", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            try{
                int rez = st.executeUpdate();
                if(rez == 1){
                    JOptionPane.showMessageDialog(rootPane, "Номер успішно створений");
                    txtNumber.setText("");
                    return true;
                }
                return false;
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Не вдалося створити номер", "Помилка", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
