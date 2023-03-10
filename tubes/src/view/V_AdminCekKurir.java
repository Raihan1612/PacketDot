/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Barang;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Model;

/**
 *
 * @author USER
 */
public class V_AdminCekKurir extends javax.swing.JFrame {
    private Object id;
    /**
     * Creates new form AdminCekBarang
     */
    public V_AdminCekKurir() {
        initComponents();
        showTable();
        showSelected();
    }

    public void showTable(){
        DefaultTableModel tabelBar;
        String [] judulTabel = {"ID", "Nama", "Telepon", "Alamat", "Kota"};
        tabelBar = new DefaultTableModel(judulTabel, 0);
        jTableKurir.setModel(tabelBar);
        
        int row = jTableKurir.getRowCount();
        for (int i = 0; i < row; i++) {
            tabelBar.removeRow(0);
        }
        
        try{
            Model m = new Model();
            String sql = "SELECT * FROM profile WHERE role = 'kurir'";
            ResultSet result = m.getData(sql);
            while(result.next()){
                String data[] = {result.getString("id"), result.getString("nama"), result.getString("telepon"), result.getString("alamat"), 
                    result.getString("kota")};
                tabelBar.addRow(data);
            }
        }catch(Exception e){
            System.err.println("error:");
        }
    }
    
    public void showSelected(){
        jTableKurir.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
             if (e.getClickCount() == 1) {
              JTable target = (JTable)e.getSource();
              int row = target.getSelectedRow();
              int column = 0;
              id = target.getValueAt(row, column);
              try{
                  Model m = new Model();
                  String sql = "SELECT * FROM profile WHERE id = "+id;
                  ResultSet result = m.getData(sql);
                  while(result.next()){
                      jTextNama.setText(result.getString("nama"));
                      jTextTelepon.setText(result.getString("telepon"));
                      jTextAlamat.setText(result.getString("alamat"));
                      jTextKota.setText(result.getString("kota"));
                  }
              } catch(Exception ex){    
                  System.err.println(ex);
              }
             }
            }
           });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKurir = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jButtonEditKurir = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jTextTelepon = new javax.swing.JTextField();
        jTextAlamat = new javax.swing.JTextField();
        jTextKota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 44)); // NOI18N
        jLabel10.setText("PACKETDOT");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 30, 280, 54);

        jTableKurir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableKurir);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 930, 120);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("DETAIL KURIR");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(460, 230, 140, 37);

        jButtonDelete.setText("Hapus");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete);
        jButtonDelete.setBounds(540, 470, 130, 50);

        jButtonEditKurir.setText("Submit Changes");
        jButtonEditKurir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditKurirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditKurir);
        jButtonEditKurir.setBounds(380, 470, 130, 50);

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/home.png"))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome);
        jButtonHome.setBounds(20, 20, 70, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NAMA:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 290, 70, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TELEPON:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 330, 100, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ALAMAT:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 370, 90, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("KOTA:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 410, 70, 22);
        jPanel1.add(jTextNama);
        jTextNama.setBounds(430, 280, 240, 30);
        jPanel1.add(jTextTelepon);
        jTextTelepon.setBounds(430, 320, 240, 30);
        jPanel1.add(jTextAlamat);
        jTextAlamat.setBounds(430, 360, 240, 30);
        jPanel1.add(jTextKota);
        jTextKota.setBounds(430, 400, 240, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg8.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditKurirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditKurirActionPerformed
        try {
            // TODO add your handling code here:
            Model m = new Model();
            String sql = "UPDATE profile SET nama = '"+jTextNama.getText()+"', telepon = '"+jTextTelepon.getText()+"', alamat = '"+jTextAlamat.getText()+"', kota = '"+jTextKota.getText()+"' WHERE id = '"+id+"'";
            m.updateData(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate!");
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(V_AdminCekKurir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditKurirActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            // TODO add your handling code here:
            Model m = new Model();
            int set = JOptionPane.showConfirmDialog(null, "Anda Yakin Akan Menghapus Data Pengiriman?");
            // No = 1 Yes = 0
            if (set == 0){
                String sql = "DELETE FROM profile WHERE id = "+id;
                m.updateData(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                showTable();
                jTextNama.setText("");
                jTextTelepon.setText("");
                jTextAlamat.setText("");
                jTextKota.setText("");
            }
                    } catch (SQLException ex) {
            Logger.getLogger(V_AdminCekKurir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        V_Admin a = new V_Admin();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

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
            java.util.logging.Logger.getLogger(V_AdminCekKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_AdminCekKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_AdminCekKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_AdminCekKurir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_AdminCekKurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEditKurir;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKurir;
    private javax.swing.JTextField jTextAlamat;
    private javax.swing.JTextField jTextKota;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JTextField jTextTelepon;
    // End of variables declaration//GEN-END:variables
}
