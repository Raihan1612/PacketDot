/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Register;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class V_Registrasi extends javax.swing.JFrame {
    
    /**
     * Creates new form Registrasi
     */
    public V_Registrasi() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JTextField();
        jTextUsername = new javax.swing.JTextField();
        jTextTelepon = new javax.swing.JTextField();
        jTextAlamat = new javax.swing.JTextField();
        jTextKota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setLayout(null);

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin", "kurir" }));
        jPanel1.add(jComboBoxRole);
        jComboBoxRole.setBounds(730, 350, 240, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("USERNAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 280, 110, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PASSWORD:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 320, 130, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NAMA:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(600, 120, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TELEPON:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(600, 160, 100, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel10.setText("PACKETDOT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 30, 240, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("REGISTRASI");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(770, 70, 120, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ALAMAT:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(600, 200, 90, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("KOTA:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(600, 240, 70, 22);

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmit);
        jButtonSubmit.setBounds(730, 400, 146, 41);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("ROLE:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(600, 350, 80, 22);
        jPanel1.add(jTextNama);
        jTextNama.setBounds(730, 110, 240, 30);
        jPanel1.add(jTextPassword);
        jTextPassword.setBounds(730, 310, 240, 30);
        jPanel1.add(jTextUsername);
        jTextUsername.setBounds(730, 270, 240, 30);
        jPanel1.add(jTextTelepon);
        jTextTelepon.setBounds(730, 150, 240, 30);
        jPanel1.add(jTextAlamat);
        jTextAlamat.setBounds(730, 190, 240, 30);
        jPanel1.add(jTextKota);
        jTextKota.setBounds(730, 230, 240, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg.png"))); // NOI18N
        jLabel11.setText("asd");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 1000, 527);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        try {
            // TODO add your handling code here:
            String nama = jTextNama.getText();
            String telepon = jTextTelepon.getText();
            String alamat = jTextAlamat.getText();
            String kota = jTextKota.getText();
            String username = jTextUsername.getText();
            String password = jTextPassword.getText();
            String role = (String) jComboBoxRole.getSelectedItem();
            
            Register r = new Register(nama, telepon, alamat, kota, username, password, role);
            
            if ("".equals(nama) || "".equals(telepon) || "".equals(alamat) || "".equals(kota) || "".equals(username) || "".equals(password) || role == ""){
                JOptionPane.showMessageDialog(null, "Isi Semua Data!");
            } else if(r.checkUsername()){
                JOptionPane.showMessageDialog(null, "Username Tidak Tersedia");
                jTextUsername.setText("");
                jTextPassword.setText("");
            } else{
                V_Login l = new V_Login();
                if ("user".equals(role)){
                    r.setRegister();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
                    setVisible(false);
                    l.setVisible(true);
                }else if ("admin".equals(role)){
                    String str = JOptionPane.showInputDialog("Masukkan Kode Untuk Admin:");
                    if ("iniadmin".equals(str)){
                        r.setRegister();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
                        setVisible(false);
                        l.setVisible(true);
                    } else{
                        JOptionPane.showMessageDialog(null, "Kode Salah");
                    }
                } else{
                    String str = JOptionPane.showInputDialog("Masukkan Kode Untuk Kurir:");
                    if ("inikurir".equals(str)){
                        r.setRegister();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
                        setVisible(false);
                        l.setVisible(true);
                    } else{
                        JOptionPane.showMessageDialog(null, "Kode Salah");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(V_Registrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(V_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAlamat;
    private javax.swing.JTextField jTextKota;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextTelepon;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
