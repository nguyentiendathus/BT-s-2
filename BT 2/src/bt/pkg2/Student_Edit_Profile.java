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

public class Student_Edit_Profile extends javax.swing.JFrame {
    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;

    public Student_Edit_Profile() throws IOException, SQLException {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        user_Fullname = new javax.swing.JTextField();
        user_Phone = new javax.swing.JTextField();
        nameLabel2 = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        update_Button = new javax.swing.JButton();
        nameLabel3 = new javax.swing.JLabel();
        user_class = new javax.swing.JTextField();
        back_Button = new javax.swing.JButton();
        user_Password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(115, 136, 193));

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
        jPanel4.add(user_Fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 350, 30));

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
        jPanel4.add(user_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 350, 30));

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel2.setText("Phone Number");
        jPanel4.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 144, 30));

        departLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        departLabel.setText("Class");
        jPanel4.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        nameLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel.setText("Password");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 135, 30));

        update_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        update_Button.setText("Update");
        update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(update_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, 30));

        nameLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 20)); // NOI18N
        nameLabel3.setText("Full name");
        jPanel4.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 103, 30));

        user_class.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_class.setText(" ");
        user_class.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_classMouseClicked(evt);
            }
        });
        user_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_classActionPerformed(evt);
            }
        });
        jPanel4.add(user_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 350, 30));

        back_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        jPanel4.add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 30));

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
        jPanel4.add(user_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 350, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PasswordActionPerformed

    private void user_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PasswordMouseClicked
        // TODO add your handling code here:
        user_Password.setText("");
    }//GEN-LAST:event_user_PasswordMouseClicked

    private void user_FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_FullnameActionPerformed

    private void user_FullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_FullnameMouseClicked
        user_Fullname.setText("");
    }//GEN-LAST:event_user_FullnameMouseClicked

    private void user_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_PhoneActionPerformed

    private void user_PhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_PhoneMouseClicked
        user_Phone.setText("");
    }//GEN-LAST:event_user_PhoneMouseClicked

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtonActionPerformed
        try {
            Student_Screen a = new Student_Screen();
        } catch (IOException ex) {
            Logger.getLogger(Student_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Student_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ButtonActionPerformed
        try{          
            ID_data dt = new ID_data();
            stm = connection.createStatement();
            String UserID = dt.read();
            String newUserPass = user_Password.getText();
            String newFullName = user_Fullname.getText();
            String newClass = user_class.getText();
            String newPhone = user_Phone.getText();

            String sql = "UPDATE student SET Student_Password = '"+newUserPass+"', Full_name = '"+newFullName+"', Class = '"+newClass+"', Phone_number = '"+newPhone+"' WHERE ID = '"+UserID+"'";
            JOptionPane.showMessageDialog(null,"Updated successfully");
            
            stm.executeUpdate(sql);
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        } catch (IOException ex) {
            Logger.getLogger(Student_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_ButtonActionPerformed

    private void display() throws IOException, SQLException
    {
        ID_data dt = new ID_data();
        String userID = dt.read();
        String fullname;
        stm = connection.createStatement();
        
        String sql = "SELECT * FROM student WHERE ID = '"+userID+"'";
             
        res = stm.executeQuery(sql);

        if(res.next()){
            user_Fullname.setText(res.getString("Full_name"));
            user_Password.setText(res.getString("Student_Password"));
            user_Phone.setText(res.getString("Phone_number"));
            user_class.setText(res.getString("Class"));

         } else{
            JOptionPane.showMessageDialog(null,"Not found");
         }

    }
    
    private void user_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_classActionPerformed

    }//GEN-LAST:event_user_classActionPerformed

    private void user_classMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_classMouseClicked
        user_class.setText("");  
    }//GEN-LAST:event_user_classMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Student_Edit_Profile().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Student_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Edit_Profile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel departLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JButton update_Button;
    private javax.swing.JTextField user_Fullname;
    private javax.swing.JTextField user_Password;
    private javax.swing.JTextField user_Phone;
    private javax.swing.JTextField user_class;
    // End of variables declaration//GEN-END:variables
}
