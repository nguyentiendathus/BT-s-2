
package bt.pkg2;

import javax.swing.JFrame;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        this.setVisible(true);
        this.setTitle("Admin");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        displayPanel = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        CreateMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        StudentMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        LectuterMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        ClassMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        CreateMenu.setText("Create");
        CreateMenu.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CreateMenuComponentAdded(evt);
            }
        });
        CreateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateMenuActionPerformed(evt);
            }
        });

        jMenuItem2.setText("create");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        CreateMenu.add(jMenuItem2);

        jMenuBar2.add(CreateMenu);

        StudentMenu.setText("All Stu");
        StudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentMenuActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Students");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        StudentMenu.add(jMenuItem3);

        jMenuBar2.add(StudentMenu);

        LectuterMenu.setText("All Lect");

        jMenuItem4.setText("Lec");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        LectuterMenu.add(jMenuItem4);

        jMenuBar2.add(LectuterMenu);

        ClassMenu.setText("All Class");

        jMenuItem5.setText("Class");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        ClassMenu.add(jMenuItem5);

        jMenuBar2.add(ClassMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateMenuActionPerformed

    createPanel createPanel = new createPanel();
    allStudentsPanel allStuPanel = new allStudentsPanel();
    all_LecPanel allLecPanel = new all_LecPanel();
    allClassPanel allClaPanel = new allClassPanel(); 
    
    boolean createPanelStatus = true;
    boolean allStuPanelStatus = true;
    boolean allLecPanelStatus = true;
    boolean allClaPanelStatus = true;
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.out.println("created");
        createPanel.setSize(507,315);
        displayPanel.add(createPanel);
        
        createPanelStatus = true;
        allStuPanelStatus = false;
        allLecPanelStatus = false;
        allClaPanelStatus = false;
        
        createPanel.setVisible(createPanelStatus);
        allStuPanel.setVisible(allStuPanelStatus);
        allLecPanel.setVisible(allLecPanelStatus);
        allClaPanel.setVisible(allClaPanelStatus);
        displayPanel.setVisible(true);       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CreateMenuComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CreateMenuComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateMenuComponentAdded

    private void StudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentMenuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.out.println("Student");
        allStuPanel.setSize(507,315);
        displayPanel.add(allStuPanel);
        
        createPanelStatus = false;
        allStuPanelStatus = true;
        allLecPanelStatus = false;
        allClaPanelStatus = false;
        
        createPanel.setVisible(createPanelStatus);
        allStuPanel.setVisible(allStuPanelStatus);
        allLecPanel.setVisible(allLecPanelStatus);
        allClaPanel.setVisible(allClaPanelStatus);
        displayPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        System.out.println("lec");
        allLecPanel.setSize(507,315);
        displayPanel.add(allLecPanel);
        
        createPanelStatus = false;
        allStuPanelStatus = false;
        allLecPanelStatus = true;
        allClaPanelStatus = false;
        
        createPanel.setVisible(createPanelStatus);
        allStuPanel.setVisible(allStuPanelStatus);
        allLecPanel.setVisible(allLecPanelStatus);
        allClaPanel.setVisible(allClaPanelStatus);
        displayPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.out.println("Class");
        allLecPanel.setSize(507,315);
        displayPanel.add(allClaPanel);
        
        createPanelStatus = false;
        allStuPanelStatus = false;
        allLecPanelStatus = false;
        allClaPanelStatus = true;
        
        createPanel.setVisible(createPanelStatus);
        allStuPanel.setVisible(allStuPanelStatus);
        allLecPanel.setVisible(allLecPanelStatus);
        allClaPanel.setVisible(allClaPanelStatus);
        displayPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ClassMenu;
    private javax.swing.JMenu CreateMenu;
    private javax.swing.JMenu LectuterMenu;
    private javax.swing.JMenu StudentMenu;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
