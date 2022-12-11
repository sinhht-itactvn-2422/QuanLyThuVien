/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;

public class formAdmin extends javax.swing.JFrame {
    
    private UserManagementPanel mStudentPanel;
    private BookManagementPanel mBookPanel;
    private InForPanel inforPanel;
    
    public formAdmin() {
        
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_exit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_UserManagement = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_BookManagement = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_info = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        tabMainBoard = new javax.swing.JTabbedPane();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Thư Viên");
        setResizable(false);

        jToolBar1.setRollover(true);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/Log-Out-icon.png"))); // NOI18N
        btn_exit.setText("Thoát");
        btn_exit.setFocusable(false);
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_exit);
        jToolBar1.add(jSeparator1);

        btn_UserManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/10207-man-student-light-skin-tone-icon.png"))); // NOI18N
        btn_UserManagement.setText("Quản Lý Bạn Đọc");
        btn_UserManagement.setFocusable(false);
        btn_UserManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_UserManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_UserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_UserManagement);
        jToolBar1.add(jSeparator2);

        btn_BookManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/books-icon.png"))); // NOI18N
        btn_BookManagement.setText("Quản Lý Sách");
        btn_BookManagement.setFocusable(false);
        btn_BookManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_BookManagement.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_BookManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BookManagementActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_BookManagement);
        jToolBar1.add(jSeparator3);

        btn_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/Info-icon.png"))); // NOI18N
        btn_info.setText("Thông Tin");
        btn_info.setFocusable(false);
        btn_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_infoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_info);
        jToolBar1.add(jSeparator4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(tabMainBoard))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_UserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserManagementActionPerformed
        if (mStudentPanel == null){
            mStudentPanel = new UserManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/hinhNen/Icon/10207-man-student-light-skin-tone-icon.png"));
            tabMainBoard.addTab("Quản Lý Bạn Đọc  ", icon, mStudentPanel, "Quản Lý Bạn Đọc");
        }
        tabMainBoard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_btn_UserManagementActionPerformed

    private void btn_BookManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookManagementActionPerformed
        if (mBookPanel == null){
            mBookPanel = new BookManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/hinhNen/Icon/books-icon.png"));
            tabMainBoard.addTab("Quản Lý Sách  ", icon, mBookPanel, "Quản Lý Sách");
        }
        tabMainBoard.setSelectedComponent(mBookPanel);
    }//GEN-LAST:event_btn_BookManagementActionPerformed

    private void btn_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_infoActionPerformed
        if (inforPanel == null){
            inforPanel = new InForPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/hinhNen/Icon/info-icon.png"));
            tabMainBoard.addTab("Thông Tin  ", icon, inforPanel, "Thông Tin");
        }
        tabMainBoard.setSelectedComponent(inforPanel);
    }//GEN-LAST:event_btn_infoActionPerformed

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
            java.util.logging.Logger.getLogger(formAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BookManagement;
    private javax.swing.JButton btn_UserManagement;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_info;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTabbedPane tabMainBoard;
    // End of variables declaration//GEN-END:variables
}
