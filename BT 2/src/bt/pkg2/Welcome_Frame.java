package bt.pkg2;

import javax.swing.JFrame;

public class Welcome_Frame extends javax.swing.JFrame {

    public Welcome_Frame() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        login_Lecturer_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        login_Student_Button = new javax.swing.JButton();
        login_Admin_Button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(185, 215, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("UVN Banh Mi", 0, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("WELCOME");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 270, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_Lecturer_Button.setBackground(new java.awt.Color(250, 250, 250));
        login_Lecturer_Button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HI\\Documents\\NetBeansProjects\\BT-s-2\\BT 2\\src\\Images and jar file\\Lecturer1.png")); // NOI18N
        login_Lecturer_Button.setToolTipText("");
        login_Lecturer_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        login_Lecturer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Lecturer_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(login_Lecturer_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 120, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Administrator");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Student");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lecturer");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        login_Student_Button.setBackground(new java.awt.Color(250, 250, 250));
        login_Student_Button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HI\\Documents\\NetBeansProjects\\BT-s-2\\BT 2\\src\\Images and jar file\\Student1.png")); // NOI18N
        login_Student_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        login_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Student_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(login_Student_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 120, 120));

        login_Admin_Button.setBackground(new java.awt.Color(250, 250, 250));
        login_Admin_Button.setIcon(new javax.swing.ImageIcon("C:\\Users\\HI\\Documents\\NetBeansProjects\\BT-s-2\\BT 2\\src\\Images and jar file\\Administrator.jpg")); // NOI18N
        login_Admin_Button.setPreferredSize(new java.awt.Dimension(70, 23));
        login_Admin_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_Admin_ButtonMouseClicked(evt);
            }
        });
        login_Admin_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_Admin_ButtonActionPerformed(evt);
            }
        });
        jPanel3.add(login_Admin_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 120));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("UVN Bay Buom", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Who you are?");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 330));

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

    private void login_Lecturer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_Lecturer_ButtonActionPerformed
        All_Lecturers a = new All_Lecturers();
        this.dispose();
    }//GEN-LAST:event_login_Lecturer_ButtonActionPerformed

    private void login_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_Student_ButtonActionPerformed
        Student_Login a = new Student_Login();
        this.dispose();
    }//GEN-LAST:event_login_Student_ButtonActionPerformed

    private void login_Admin_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_Admin_ButtonMouseClicked

    }//GEN-LAST:event_login_Admin_ButtonMouseClicked

    private void login_Admin_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_Admin_ButtonActionPerformed
        Admin_Login a = new Admin_Login();
        this.dispose();
    }//GEN-LAST:event_login_Admin_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_Admin_Button;
    private javax.swing.JButton login_Lecturer_Button;
    private javax.swing.JButton login_Student_Button;
    // End of variables declaration//GEN-END:variables
}
