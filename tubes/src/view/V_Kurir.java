/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class V_Kurir extends javax.swing.JFrame {

    /**
     * Creates new form Kurir
     */
    public V_Kurir() {
        initComponents();
        welcome();
    }
    
    public void welcome(){
        try {
            Login l = new Login();
            ResultSet result = l.getUserData();
            if (result.next()){
                jWelcome.setText("Selamat Datang, "+result.getString("nama")+"!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(V_Kurir.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel10 = new javax.swing.JLabel();
        jWelcome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonAmbilBarang = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 44)); // NOI18N
        jLabel10.setText("PACKETDOT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 30, 310, 54);

        jWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jWelcome.setText("Selamat Datang, nama_user!");
        jPanel1.add(jWelcome);
        jWelcome.setBounds(540, 150, 350, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/status.png"))); // NOI18N
        jButton2.setText("Set Status Barang");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(740, 240, 170, 60);

        jButtonAmbilBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/barang-resize.png"))); // NOI18N
        jButtonAmbilBarang.setText("Ambil Barang");
        jButtonAmbilBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAmbilBarang);
        jButtonAmbilBarang.setBounds(520, 240, 170, 60);

        jButtonLogOut.setText("Logout");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogOut);
        jButtonLogOut.setBounds(660, 430, 90, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg6.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_Login l = new V_Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonAmbilBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilBarangActionPerformed
        // TODO add your handling code here:
        V_KurirAmbilBarang k = new V_KurirAmbilBarang();
        k.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonAmbilBarangActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        V_KurirSetStatusBarang k = new V_KurirSetStatusBarang();
        k.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(V_Kurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Kurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Kurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Kurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Kurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAmbilBarang;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jWelcome;
    // End of variables declaration//GEN-END:variables
}
