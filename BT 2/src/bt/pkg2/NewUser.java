package bt.pkg2;
 
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewUser extends javax.swing.JFrame {
    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;

    public NewUser() {
        initComponents();
        connection = Database.connection();
        this.setVisible(true);
        this.setTitle("NewUser");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        new_Fullname_Field = new javax.swing.JTextField();
        new_Phone_Field = new javax.swing.JTextField();
        new_department_Field = new javax.swing.JComboBox<>();
        nameLabel2 = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        create_newUser_Button = new javax.swing.JButton();
        createButton2 = new javax.swing.JButton();
        nameLabel3 = new javax.swing.JLabel();
        new_User_Field = new javax.swing.JTextField();
        new_PassWord_Field = new javax.swing.JPasswordField();
        checkPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(185, 215, 240));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("New User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jPanel4.setBackground(new java.awt.Color(204, 250, 210));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_Fullname_Field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        new_Fullname_Field.setText("Enter your full name");
        new_Fullname_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_Fullname_FieldMouseClicked(evt);
            }
        });
        new_Fullname_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_Fullname_FieldActionPerformed(evt);
            }
        });
        jPanel4.add(new_Fullname_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 350, 30));

        new_Phone_Field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        new_Phone_Field.setText("Enter your phone number");
        new_Phone_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_Phone_FieldMouseClicked(evt);
            }
        });
        new_Phone_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_Phone_FieldActionPerformed(evt);
            }
        });
        jPanel4.add(new_Phone_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 350, 30));

        new_department_Field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        new_department_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student", "Lecturer" }));
        jPanel4.add(new_department_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 350, -1));

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel2.setText("Phone Number");
        jPanel4.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 144, 30));

        departLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        departLabel.setText("Department");
        jPanel4.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        nameLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel.setText("Password");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 135, 30));

        nameLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel1.setText("UserID");
        jPanel4.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 76, 30));

        create_newUser_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        create_newUser_Button.setText("Create");
        create_newUser_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_newUser_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(create_newUser_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 30));

        createButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createButton2.setText("Back");
        createButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(createButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 30));

        nameLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel3.setText("Full name");
        jPanel4.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 103, 30));

        new_User_Field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        new_User_Field.setText("Enter your ID");
        new_User_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_User_FieldMouseClicked(evt);
            }
        });
        new_User_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_User_FieldActionPerformed(evt);
            }
        });
        jPanel4.add(new_User_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 350, 30));

        new_PassWord_Field.setText("Enter your password");
        new_PassWord_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_PassWord_FieldMouseClicked(evt);
            }
        });
        jPanel4.add(new_PassWord_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 350, 30));

        checkPassword.setBackground(new java.awt.Color(204, 250, 210));
        checkPassword.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        checkPassword.setText("Check Password");
        checkPassword.setMaximumSize(new java.awt.Dimension(40, 40));
        checkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(checkPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 610, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_Fullname_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_Fullname_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_Fullname_FieldActionPerformed

    private void new_Phone_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_Phone_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_Phone_FieldActionPerformed

    private void create_newUser_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_newUser_ButtonActionPerformed
        try{          
            stm = connection.createStatement();
            String newUserID = new_User_Field.getText();
            String newUserPass = new String(new_PassWord_Field.getPassword());
            String newFullName = new_Fullname_Field.getText();
            String newClass = "";
            String newTechnical = "";
            String newPhone = new_Phone_Field.getText();
            String newDepartment = (String) new_department_Field.getSelectedItem();
            
            // Up dữ liệu lên mySQL
            if(newDepartment == "Student"){
                String sql = "INSERT INTO student(ID, Student_Password, FullName,Class, PhoneNumber) VALUES('"+newUserID+"','"+newUserPass+"','"+newFullName+"','"+newClass+"','"+newPhone+"')";
                JOptionPane.showMessageDialog(null,"Created student successfully");
            
                stm.executeUpdate(sql);
            }else if(newDepartment == "Lecturer"){
                String sql = "INSERT INTO lecturers(ID,Lecturer_password, Full_Name, Technical, Phone_number) VALUES('"+newUserID+"','"+newUserPass+"','"+newFullName+"','"+newTechnical+"','"+newPhone+"')";
                JOptionPane.showMessageDialog(null,"Created lecturer successfully");
            
                stm.executeUpdate(sql);
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_create_newUser_ButtonActionPerformed

    private void createButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton2ActionPerformed
        Admin_Screen a = new Admin_Screen();
        this.dispose();
    }//GEN-LAST:event_createButton2ActionPerformed

    private void new_Fullname_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_Fullname_FieldMouseClicked
        this.new_Fullname_Field.setText("");
    }//GEN-LAST:event_new_Fullname_FieldMouseClicked

    private void new_Phone_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_Phone_FieldMouseClicked
        this.new_Phone_Field.setText("");
    }//GEN-LAST:event_new_Phone_FieldMouseClicked

    private void new_User_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_User_FieldMouseClicked
        this.new_User_Field.setText("");
    }//GEN-LAST:event_new_User_FieldMouseClicked

    private void new_User_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_User_FieldActionPerformed
  
    }//GEN-LAST:event_new_User_FieldActionPerformed

    private void checkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPasswordActionPerformed
        if (checkPassword.isSelected()){
           new_PassWord_Field.setEchoChar((char)0);
        }
        else{
            new_PassWord_Field.setEchoChar('*');
        }
    }//GEN-LAST:event_checkPasswordActionPerformed

    private void new_PassWord_FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_PassWord_FieldMouseClicked
        this.new_PassWord_Field.setText("");
    }//GEN-LAST:event_new_PassWord_FieldMouseClicked

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkPassword;
    private javax.swing.JButton createButton2;
    private javax.swing.JButton create_newUser_Button;
    private javax.swing.JLabel departLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JTextField new_Fullname_Field;
    private javax.swing.JPasswordField new_PassWord_Field;
    private javax.swing.JTextField new_Phone_Field;
    private javax.swing.JTextField new_User_Field;
    private javax.swing.JComboBox<String> new_department_Field;
    // End of variables declaration//GEN-END:variables
}
