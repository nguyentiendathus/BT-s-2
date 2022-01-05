
package bt.pkg2;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Lecturer_Edit_Profile extends javax.swing.JFrame {

    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;
    
    
    public Lecturer_Edit_Profile() throws IOException, SQLException {
        initComponents();
        connection = Database.connection();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        user_Fullname = new javax.swing.JTextField();
        user_Tech = new javax.swing.JTextField();
        nameLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        update_Button = new javax.swing.JButton();
        nameLabel3 = new javax.swing.JLabel();
        back_Button = new javax.swing.JButton();
        user_Password = new javax.swing.JTextField();
        nameLabel4 = new javax.swing.JLabel();
        user_Phone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 136, 193));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Proflie");

        jPanel4.setBackground(new java.awt.Color(220, 218, 232));
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
        jPanel4.add(user_Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 350, 30));

        user_Tech.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_Tech.setText(" ");
        user_Tech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_TechMouseClicked(evt);
            }
        });
        user_Tech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_TechActionPerformed(evt);
            }
        });
        jPanel4.add(user_Tech, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 350, 30));

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel2.setText("Tecnical");
        jPanel4.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 144, 30));

        nameLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel.setText("Password");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 135, 30));

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_Button.setText("Update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 30));

        nameLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel3.setText("Full name");
        jPanel4.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 103, 30));

        back_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 30));

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
        jPanel4.add(user_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 350, 30));

        nameLabel4.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel4.setText("Phone Number");
        jPanel4.add(nameLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 144, 30));

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
        jPanel4.add(user_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 350, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_FullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_FullnameMouseClicked
        user_Fullname.setText("");
    }//GEN-LAST:event_user_FullnameMouseClicked

    private void user_FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_FullnameActionPerformed

    private void user_TechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_TechMouseClicked
        user_Tech.setText("");
    }//GEN-LAST:event_user_TechMouseClicked

    private void user_TechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_TechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_TechActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        try{
            ID_data dt = new ID_data();
            stm = connection.createStatement();
            String UserID = dt.read();
            String newUserPass = user_Password.getText();
            String newFullName = user_Fullname.getText();
            String newPhone = user_Phone.getText();
            String newTech = user_Tech.getText();

            String sql = "UPDATE lecturers SET Lecturer_Password = '"+newUserPass+"',Phone_number = '"+newPhone+"' , Full_name = '"+newFullName+"', Technical = '"+newTech+"' WHERE ID = '"+UserID+"'";
            JOptionPane.showMessageDialog(null,"Updated successfully");

            stm.executeUpdate(sql);

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } catch (IOException ex) {
            Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void display() throws IOException, SQLException
    {
        ID_data dt = new ID_data();
        String userID = dt.read();
        String fullname;
        stm = connection.createStatement();
        
        String sql = "SELECT * FROM lecturers WHERE ID = '"+userID+"'";
             
        res = stm.executeQuery(sql);

        if(res.next()){
            user_Fullname.setText(res.getString("Full_name"));
            user_Password.setText(res.getString("Lecturer_Password"));
            user_Phone.setText(res.getString("Phone_number"));
            user_Tech.setText(res.getString("Technical"));

         } else{
            JOptionPane.showMessageDialog(null,"Not found");
         }

    }
    
    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        try {
            Lecturer_Screen a = new Lecturer_Screen();
        } catch (IOException ex) {
            Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void user_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PasswordMouseClicked
        // TODO add your handling code here:
        user_Password.setText("");
    }//GEN-LAST:event_user_PasswordMouseClicked

    private void user_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PasswordActionPerformed

    private void user_PhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PhoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PhoneMouseClicked

    private void user_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PhoneActionPerformed

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
            java.util.logging.Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lecturer_Edit_Profile().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Lecturer_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JButton update_Button;
    private javax.swing.JTextField user_Fullname;
    private javax.swing.JTextField user_Password;
    private javax.swing.JTextField user_Phone;
    private javax.swing.JTextField user_Tech;
    // End of variables declaration//GEN-END:variables
}
