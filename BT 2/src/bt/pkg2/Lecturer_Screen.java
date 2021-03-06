
package bt.pkg2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Lecturer_Screen extends javax.swing.JFrame {

    
    public Lecturer_Screen() throws IOException, SQLException {
        initComponents();
        connection = Database.connection();
        this.setVisible(true);
        this.setTitle("Lecturer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nameLabel2 = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        nameDisplay = new javax.swing.JLabel();
        student_Image = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phoneDisplay = new javax.swing.JLabel();
        techDisplay = new javax.swing.JLabel();
        nameLabel6 = new javax.swing.JLabel();
        student_SignOut_Button = new javax.swing.JButton();
        student_Edit_Button = new javax.swing.JButton();
        student_All_course = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(115, 136, 193));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Lecturer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(220, 218, 232));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        nameLabel2.setText("Phone Number:");
        jPanel5.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, 30));

        departLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        departLabel.setText("Technical: ");
        jPanel5.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 20));

        nameDisplay.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        jPanel5.add(nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Image");

        javax.swing.GroupLayout student_ImageLayout = new javax.swing.GroupLayout(student_Image);
        student_Image.setLayout(student_ImageLayout);
        student_ImageLayout.setHorizontalGroup(
            student_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, student_ImageLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );
        student_ImageLayout.setVerticalGroup(
            student_ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_ImageLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel5.add(student_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        phoneDisplay.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        jPanel5.add(phoneDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 80, 30));

        techDisplay.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        jPanel5.add(techDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 80, 30));

        nameLabel6.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        nameLabel6.setText("Full name:");
        jPanel5.add(nameLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 210));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 210));

        student_SignOut_Button.setBackground(new java.awt.Color(250, 250, 250));
        student_SignOut_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_SignOut_Button.setText("Sign out");
        student_SignOut_Button.setToolTipText("");
        student_SignOut_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        student_SignOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_SignOut_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(student_SignOut_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 110, 33));

        student_Edit_Button.setBackground(new java.awt.Color(250, 250, 250));
        student_Edit_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_Edit_Button.setText("Edit Profile");
        student_Edit_Button.setToolTipText("");
        student_Edit_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        student_Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_Edit_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(student_Edit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 33));

        student_All_course.setBackground(new java.awt.Color(250, 250, 250));
        student_All_course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_All_course.setText("All course");
        student_All_course.setToolTipText("");
        student_All_course.setPreferredSize(new java.awt.Dimension(70, 23));
        student_All_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_All_courseActionPerformed(evt);
            }
        });
        jPanel3.add(student_All_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 110, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_SignOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_SignOut_ButtonActionPerformed
        Lecturer_Login a = new Lecturer_Login();
        this.dispose();
    }//GEN-LAST:event_student_SignOut_ButtonActionPerformed

    private void student_Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_Edit_ButtonActionPerformed
        try {
            Lecturer_Edit_Profile a = new Lecturer_Edit_Profile();
        } catch (IOException ex) {
            Logger.getLogger(Lecturer_Screen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lecturer_Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_student_Edit_ButtonActionPerformed

    
    Connection connection = null;
    Statement stm = null;
    ResultSet res = null;
    private void display() throws IOException, SQLException
    {
        ID_data dt = new ID_data();
        String userID = dt.read();
        stm = connection.createStatement();
        
        String sql = "SELECT * FROM lecturers WHERE ID = '"+userID+"'";
             
        res = stm.executeQuery(sql);

        if(res.next()){
           nameDisplay.setText(res.getString("Full_Name"));
           techDisplay.setText(res.getString("Technical"));
           phoneDisplay.setText(res.getString("Phone_Number"));

        } else{
           JOptionPane.showMessageDialog(null,"Not found");
        }
    }
    private void student_All_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_All_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_All_courseActionPerformed

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
            java.util.logging.Logger.getLogger(Lecturer_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lecturer_Screen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Lecturer_Screen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Lecturer_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel departLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameDisplay;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel6;
    private javax.swing.JLabel phoneDisplay;
    private javax.swing.JButton student_All_course;
    private javax.swing.JButton student_Edit_Button;
    private javax.swing.JPanel student_Image;
    private javax.swing.JButton student_SignOut_Button;
    private javax.swing.JLabel techDisplay;
    // End of variables declaration//GEN-END:variables
}
