package bt.pkg2;
 
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Student_Edit_Profile extends javax.swing.JFrame {
    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;

    public Student_Edit_Profile() {
        initComponents();
        connection = Database.connection();
        this.setVisible(true);
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
        user_Fullname = new javax.swing.JTextField();
        user_Phone = new javax.swing.JTextField();
        nameLabel2 = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        update_Button = new javax.swing.JButton();
        nameLabel3 = new javax.swing.JLabel();
        user_Department = new javax.swing.JTextField();
        back_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        user_ID = new javax.swing.JTextField();
        user_Password = new javax.swing.JTextField();
        user_Department1 = new javax.swing.JTextField();
        departLabel1 = new javax.swing.JLabel();
        departLabel2 = new javax.swing.JLabel();
        user_Department2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(185, 215, 240));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Proflie");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        jPanel4.setBackground(new java.awt.Color(204, 250, 210));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_Fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Fullname.setText(" ");
        user_Fullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_FullnameMouseClicked(evt);
            }
        });
        user_Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_FullnameActionPerformed(evt);
            }
        });
        jPanel4.add(user_Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 350, 30));

        user_Phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Phone.setText(" ");
        user_Phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_PhoneMouseClicked(evt);
            }
        });
        user_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_PhoneActionPerformed(evt);
            }
        });
        jPanel4.add(user_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 350, 30));

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel2.setText("Phone Number");
        jPanel4.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 144, 30));

        departLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        departLabel.setText("Class");
        jPanel4.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        nameLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel.setText("Password");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 135, 30));

        nameLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel1.setText("UserID");
        jPanel4.add(nameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 76, 30));

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_Button.setText("Update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 30));

        nameLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel3.setText("Full name");
        jPanel4.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 103, 30));

        user_Department.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Department.setText(" ");
        user_Department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_DepartmentMouseClicked(evt);
            }
        });
        user_Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_DepartmentActionPerformed(evt);
            }
        });
        jPanel4.add(user_Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 350, 30));

        back_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, 30));

        delete_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delete_Button.setText("Delete");
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(delete_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, 30));

        user_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_IDMouseClicked(evt);
            }
        });
        user_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_IDActionPerformed(evt);
            }
        });
        jPanel4.add(user_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 350, 30));

        user_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Password.setText(" ");
        user_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_PasswordMouseClicked(evt);
            }
        });
        user_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_PasswordActionPerformed(evt);
            }
        });
        jPanel4.add(user_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 350, 30));

        user_Department1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Department1.setText(" ");
        user_Department1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_Department1MouseClicked(evt);
            }
        });
        user_Department1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_Department1ActionPerformed(evt);
            }
        });
        jPanel4.add(user_Department1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 350, 30));

        departLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        departLabel1.setText("Date of birth");
        jPanel4.add(departLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        departLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        departLabel2.setText("Adress");
        jPanel4.add(departLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        user_Department2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Department2.setText(" ");
        user_Department2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_Department2MouseClicked(evt);
            }
        });
        user_Department2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_Department2ActionPerformed(evt);
            }
        });
        jPanel4.add(user_Department2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 350, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 370));

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

    private void user_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_IDActionPerformed
        
    }//GEN-LAST:event_user_IDActionPerformed

    private void user_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_IDMouseClicked
        user_ID.setText("");
    }//GEN-LAST:event_user_IDMouseClicked

    private void user_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PasswordActionPerformed

    private void user_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PasswordMouseClicked

    private void user_FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_FullnameActionPerformed

    private void user_FullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_FullnameMouseClicked

    }//GEN-LAST:event_user_FullnameMouseClicked

    private void user_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PhoneActionPerformed

    private void user_PhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PhoneMouseClicked

    }//GEN-LAST:event_user_PhoneMouseClicked

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        Student_Screen a = new Student_Screen();
        this.dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed

    }//GEN-LAST:event_update_ButtonActionPerformed

    private void user_DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_DepartmentActionPerformed

    }//GEN-LAST:event_user_DepartmentActionPerformed

    private void user_DepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_DepartmentMouseClicked

    }//GEN-LAST:event_user_DepartmentMouseClicked

    private void user_Department1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_Department1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_Department1MouseClicked

    private void user_Department1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_Department1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_Department1ActionPerformed

    private void user_Department2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_Department2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_Department2MouseClicked

    private void user_Department2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_Department2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_Department2ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Edit_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JButton delete_Button;
    private javax.swing.JLabel departLabel;
    private javax.swing.JLabel departLabel1;
    private javax.swing.JLabel departLabel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JButton update_Button;
    private javax.swing.JTextField user_Department;
    private javax.swing.JTextField user_Department1;
    private javax.swing.JTextField user_Department2;
    private javax.swing.JTextField user_Fullname;
    private javax.swing.JTextField user_ID;
    private javax.swing.JTextField user_Password;
    private javax.swing.JTextField user_Phone;
    // End of variables declaration//GEN-END:variables
}
