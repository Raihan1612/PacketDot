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
import model.Model;

/**
 *
 * @author USER
 */
public class V_User extends javax.swing.JFrame {
    private ResultSet result;
    /**
     * Creates new form User
     */
    public V_User() {
        try {
            initComponents();
            welcome();
        } catch (SQLException ex) {
            Logger.getLogger(V_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void welcome() throws SQLException{
        Login l = new Login();
        Model m = new Model();
        String sql = "SELECT * FROM profile WHERE id = '"+l.getId_login()+"'";
        result = m.getData(sql);
        if(result.next()){
            jWelcome.setText("Selamat Datang, "+result.getString("nama")+"!");
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
        jButtonCekBarang = new javax.swing.JButton();
        jButtonKirim = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 44)); // NOI18N
        jLabel10.setText("PACKETDOT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 60, 310, 54);

        jWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jWelcome.setText("Selamat Datang, nama_user!");
        jPanel1.add(jWelcome);
        jWelcome.setBounds(500, 110, 370, 40);

        jButtonCekBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/barang-resize.png"))); // NOI18N
        jButtonCekBarang.setText("Cek Barang");
        jButtonCekBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCekBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCekBarang);
        jButtonCekBarang.setBounds(510, 200, 160, 60);

        jButtonKirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/kirim.png"))); // NOI18N
        jButtonKirim.setText("Kirim Barang");
        jButtonKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKirimActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonKirim);
        jButtonKirim.setBounds(690, 200, 160, 60);

        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/edit.png"))); // NOI18N
        jButtonEdit.setText("Edit Profile");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEdit);
        jButtonEdit.setBounds(590, 290, 180, 60);

        jButtonLogOut.setText("Logout");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogOut);
        jButtonLogOut.setBounds(631, 410, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_Login l = new V_Login();
        l.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonCekBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCekBarangActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_UserCekBarang u = new V_UserCekBarang();
        u.setVisible(true);
    }//GEN-LAST:event_jButtonCekBarangActionPerformed

    private void jButtonKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKirimActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_UserKirimBarang u = new V_UserKirimBarang();
        u.setVisible(true);
    }//GEN-LAST:event_jButtonKirimActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_UserEditProfile u = new V_UserEditProfile();
        u.setVisible(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

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
            java.util.logging.Logger.getLogger(V_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCekBarang;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonKirim;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jWelcome;
    // End of variables declaration//GEN-END:variables
}
