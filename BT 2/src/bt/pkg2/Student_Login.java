package bt.pkg2;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Student_Login extends javax.swing.JFrame {
    
    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;

    public Student_Login() {
        initComponents();
        connection = Database.connection();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkPassword = new javax.swing.JCheckBox();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        forgotPasswordButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        back_Welcome_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(185, 215, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jPanel2.setBackground(new java.awt.Color(220, 218, 232));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkPassword.setBackground(new java.awt.Color(220, 218, 232));
        checkPassword.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        checkPassword.setText("Check Password");
        checkPassword.setMaximumSize(new java.awt.Dimension(40, 40));
        checkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(checkPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 156, -1, -1));

        userNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameField.setText("Enter your ID");
        userNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameFieldMouseClicked(evt);
            }
        });
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 49, 349, 35));

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setText("password");
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 114, 349, 35));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 24)); // NOI18N
        jLabel2.setText("User");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 55, 111, -1));

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 115, 111, -1));

        forgotPasswordButton.setBackground(new java.awt.Color(250, 250, 250));
        forgotPasswordButton.setFont(new java.awt.Font("Windsor", 0, 14)); // NOI18N
        forgotPasswordButton.setText("Forgot password");
        jPanel2.add(forgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 40));

        loginButton.setBackground(new java.awt.Color(250, 250, 250));
        loginButton.setFont(new java.awt.Font("Windsor", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 217, 88, 40));

        back_Welcome_Button.setBackground(new java.awt.Color(250, 250, 250));
        back_Welcome_Button.setFont(new java.awt.Font("Windsor", 0, 14)); // NOI18N
        back_Welcome_Button.setText("Back");
        back_Welcome_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_Welcome_ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(back_Welcome_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 88, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 600, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        try{
            
            stm = connection.createStatement();
            String userName = userNameField.getText();
            String userPass = new String(passwordField.getPassword());
         
           
            String sql = "SELECT * FROM student WHERE ID ='"+ userName+"' && Password = '"+userPass+"'";
            
            res = stm.executeQuery(sql);      
           
            if(res.next()){
                setVisible(false);
                Student_Screen stu = new Student_Screen();
                stu.setVisible(true);
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Password or ID is invalid");
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }


    }//GEN-LAST:event_loginButtonActionPerformed

    private void checkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPasswordActionPerformed
        if (checkPassword.isSelected()){
            passwordField.setEchoChar((char)0);
        }
        else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPasswordActionPerformed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        this.passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void userNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameFieldMouseClicked
      this.userNameField.setText("");
    }//GEN-LAST:event_userNameFieldMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void back_Welcome_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_Welcome_ButtonActionPerformed
        Welcome_Frame a = new Welcome_Frame();
        this.dispose();
    }//GEN-LAST:event_back_Welcome_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Welcome_Button;
    private javax.swing.JCheckBox checkPassword;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
