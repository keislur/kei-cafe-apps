/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

/**
 *
 * @author KeimalST
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public AdminPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        to_user = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        to_menu = new javax.swing.JButton();
        to_order = new javax.swing.JButton();
        to_laporan = new javax.swing.JButton();
        to_transaksi = new javax.swing.JButton();
        to_detailOrder = new javax.swing.JButton();
        to_menu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PAGE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        to_user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_user.setText("DATA USER");
        to_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_userActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("LOGOUT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        to_menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_menu.setText("DATA MENU");
        to_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_menuActionPerformed(evt);
            }
        });

        to_order.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_order.setText("DATA ORDER");
        to_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_orderActionPerformed(evt);
            }
        });

        to_laporan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_laporan.setText("GENERATE LAPORAN");
        to_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_laporanActionPerformed(evt);
            }
        });

        to_transaksi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_transaksi.setText("DATA TRANSAKSI");
        to_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_transaksiActionPerformed(evt);
            }
        });

        to_detailOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_detailOrder.setText("DETAIL ORDER");
        to_detailOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_detailOrderActionPerformed(evt);
            }
        });

        to_menu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        to_menu1.setText("DATA CHART");
        to_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_menu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(to_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_detailOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_order, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_user, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(to_user)
                .addGap(18, 18, 18)
                .addComponent(to_menu)
                .addGap(18, 18, 18)
                .addComponent(to_menu1)
                .addGap(18, 18, 18)
                .addComponent(to_order)
                .addGap(18, 18, 18)
                .addComponent(to_detailOrder)
                .addGap(18, 18, 18)
                .addComponent(to_transaksi)
                .addGap(18, 18, 18)
                .addComponent(to_laporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void to_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_menuActionPerformed
        // TODO add your handling code here:
        Menu lg = new Menu();
        lg.setVisible(true);
        this.setVisible(false);            
    }//GEN-LAST:event_to_menuActionPerformed

    private void to_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_userActionPerformed
        // TODO add your handling code here:
        User lg = new User();
        lg.setVisible(true);
        this.setVisible(false);
        lg.btnBack1.setVisible(false);
    }//GEN-LAST:event_to_userActionPerformed

    private void to_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_orderActionPerformed
        // TODO add your handling code here:
        Order lg = new Order();
        lg.setVisible(true);
        this.setVisible(false);
        lg.btnBack1.setVisible(false);
        lg.btnInsert1.setVisible(false);
    }//GEN-LAST:event_to_orderActionPerformed

    private void to_detailOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_detailOrderActionPerformed
        // TODO add your handling code here:
        DetailOrder lg = new DetailOrder();
        lg.setVisible(true);
        this.setVisible(false);       
        lg.btnBack1.setVisible(false);   
        lg.btnInsert2.setVisible(false);
    }//GEN-LAST:event_to_detailOrderActionPerformed

    private void to_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_transaksiActionPerformed
        // TODO add your handling code here:
        Transaksi lg = new Transaksi();
        lg.setVisible(true);
        this.setVisible(false);       
        lg.btnBack1.setVisible(false); 
        lg.txtHarga.setEnabled(false);    
    }//GEN-LAST:event_to_transaksiActionPerformed

    private void to_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_laporanActionPerformed
        // TODO add your handling code here:
        Laporan lg = new Laporan();
        lg.setVisible(true);
        this.setVisible(false);    
        lg.btnBack1.setVisible(false);
    }//GEN-LAST:event_to_laporanActionPerformed

    private void to_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_menu1ActionPerformed
        // TODO add your handling code here:
        Chart lg = new Chart();
        lg.setVisible(true);
        this.setVisible(false);
        lg.btnBack1.setVisible(false);
        lg.btnInsert1.setVisible(false);
    }//GEN-LAST:event_to_menu1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton to_detailOrder;
    private javax.swing.JButton to_laporan;
    private javax.swing.JButton to_menu;
    private javax.swing.JButton to_menu1;
    private javax.swing.JButton to_order;
    private javax.swing.JButton to_transaksi;
    private javax.swing.JButton to_user;
    // End of variables declaration//GEN-END:variables
}