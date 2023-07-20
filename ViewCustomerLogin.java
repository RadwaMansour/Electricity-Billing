/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adminmodule;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ALMASA
 */
public class ViewCustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    public ViewCustomerLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        PasswordCustomer = new javax.swing.JPasswordField();
        CheckShowPasswordCustomer = new javax.swing.JCheckBox();
        register = new javax.swing.JButton();
        back = new javax.swing.JButton();
        loginCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Password");

        UserName.setBackground(new java.awt.Color(153, 153, 153));
        UserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        UserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UserName.setSelectionColor(new java.awt.Color(255, 255, 255));

        PasswordCustomer.setBackground(new java.awt.Color(153, 153, 153));
        PasswordCustomer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PasswordCustomer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));
        PasswordCustomer.setMargin(new java.awt.Insets(2, 1, 2, 1));
        PasswordCustomer.setSelectionColor(new java.awt.Color(255, 255, 255));
        PasswordCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordCustomerActionPerformed(evt);
            }
        });

        CheckShowPasswordCustomer.setBackground(new java.awt.Color(153, 153, 153));
        CheckShowPasswordCustomer.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CheckShowPasswordCustomer.setForeground(new java.awt.Color(0, 102, 102));
        CheckShowPasswordCustomer.setText("Show Password");
        CheckShowPasswordCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        CheckShowPasswordCustomer.setDisplayedMnemonicIndex(1);
        CheckShowPasswordCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckShowPasswordCustomerActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(0, 102, 102));
        register.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 102, 102));
        back.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        loginCustomer.setBackground(new java.awt.Color(0, 102, 102));
        loginCustomer.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        loginCustomer.setForeground(new java.awt.Color(255, 255, 255));
        loginCustomer.setText("Login");
        loginCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckShowPasswordCustomer)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(loginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PasswordCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckShowPasswordCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(loginCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordCustomerActionPerformed

    private void CheckShowPasswordCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckShowPasswordCustomerActionPerformed
        // TODO add your handling code here:
        if (CheckShowPasswordCustomer.isSelected()) {
            PasswordCustomer.setEchoChar((char) 0);
        } else
            PasswordCustomer.setEchoChar('*');
    }//GEN-LAST:event_CheckShowPasswordCustomerActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_registerActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainLogin Main = new MainLogin();
        Main.setLocation(400, 200);
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void loginCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginCustomerActionPerformed
        // TODO add your handling code here:
        String UserNameCustomer = UserName.getText();
        String passwordCustomer = PasswordCustomer.getText();
        LoginCustomer CustomerLogined = new LoginCustomer();
        String UserCustomer = "information";
        boolean CheckCustomer = false;
      
            CheckCustomer = CustomerLogined.login(UserNameCustomer, passwordCustomer);
        
        if (CheckCustomer) {
            JOptionPane.showMessageDialog(null ,  "Welcome " + UserName.getText(), "Successful Login",JOptionPane.PLAIN_MESSAGE );
            ViewCustomerLogin Customer = new ViewCustomerLogin();
            Customer.setLocation(400, 200);
            Customer.setVisible(true);
            this.dispose();
        } else
            JOptionPane.showMessageDialog(null, "Invalid User Name or Invalid Password", "Login Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_loginCustomerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckShowPasswordCustomer;
    private javax.swing.JPasswordField PasswordCustomer;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginCustomer;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
