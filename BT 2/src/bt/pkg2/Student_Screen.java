package bt.pkg2;

import javax.swing.JFrame;

public class Student_Screen extends javax.swing.JFrame {

    public Student_Screen() {
        initComponents();
        this.setVisible(true);
        this.setTitle("Admin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        student_Results_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nameLabel2 = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        nameLabel3 = new javax.swing.JLabel();
        departLabel1 = new javax.swing.JLabel();
        departLabel2 = new javax.swing.JLabel();
        student_Image = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        student_SignOut_Button = new javax.swing.JButton();
        student_Edit_Button = new javax.swing.JButton();
        student_Sign_Button = new javax.swing.JButton();
        student_Contact_Button = new javax.swing.JButton();
        student_All_course = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(185, 215, 240));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student_Results_Button.setBackground(new java.awt.Color(250, 250, 250));
        student_Results_Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student_Results_Button.setText("Study results");
        student_Results_Button.setToolTipText("");
        student_Results_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        student_Results_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_Results_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(student_Results_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 110, 33));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 250, 210));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        nameLabel2.setText("Phone Number:");
        jPanel5.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        departLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        departLabel.setText("Class:");
        jPanel5.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 20));

        nameLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        nameLabel3.setText("Full name:");
        jPanel5.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 80, 30));

        departLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        departLabel1.setText("Date of birth:");
        jPanel5.add(departLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 20));

        departLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 14)); // NOI18N
        departLabel2.setText("Adress:");
        jPanel5.add(departLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, 20));

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

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 390));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 390));

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
        jPanel3.add(student_SignOut_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 110, 33));

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

        student_Sign_Button.setBackground(new java.awt.Color(250, 250, 250));
        student_Sign_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_Sign_Button.setText("Sign course");
        student_Sign_Button.setToolTipText("");
        student_Sign_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        student_Sign_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_Sign_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(student_Sign_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 110, 33));

        student_Contact_Button.setBackground(new java.awt.Color(250, 250, 250));
        student_Contact_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        student_Contact_Button.setText("Contact");
        student_Contact_Button.setToolTipText("");
        student_Contact_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        student_Contact_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_Contact_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(student_Contact_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 110, 33));

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
        jPanel3.add(student_All_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 110, 33));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_Results_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_Results_ButtonActionPerformed
        
    }//GEN-LAST:event_student_Results_ButtonActionPerformed

    private void student_SignOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_SignOut_ButtonActionPerformed
        Student_Login a = new Student_Login();
        this.dispose();
    }//GEN-LAST:event_student_SignOut_ButtonActionPerformed

    private void student_Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_Edit_ButtonActionPerformed
        Student_Edit_Profile a = new Student_Edit_Profile();
        this.dispose();
    }//GEN-LAST:event_student_Edit_ButtonActionPerformed

    private void student_Sign_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_Sign_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_Sign_ButtonActionPerformed

    private void student_Contact_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_Contact_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_Contact_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel departLabel;
    private javax.swing.JLabel departLabel1;
    private javax.swing.JLabel departLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JButton student_All_course;
    private javax.swing.JButton student_Contact_Button;
    private javax.swing.JButton student_Edit_Button;
    private javax.swing.JPanel student_Image;
    private javax.swing.JButton student_Results_Button;
    private javax.swing.JButton student_SignOut_Button;
    private javax.swing.JButton student_Sign_Button;
    // End of variables declaration//GEN-END:variables
}
