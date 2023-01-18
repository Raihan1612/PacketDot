/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Model;

/**
 *
 * @author USER
 */
public class Barang {
    private String namaKirim;
    private String alamatKirim;
    private String kotaKirim;
    private String teleponKirim;
    private String namaTerima;
    private String alamatTerima;
    private String kotaTerima;
    private String teleponTerima;
    private String namaBarang;
    private float beratBarang;
    private String jenisPengiriman;

    public Barang(){
    }
    
    public Barang(String namaKirim, String alamatKirim, String kotaKirim, String teleponKirim, String namaTerima, String alamatTerima, String kotaTerima, String teleponTerima, String namaBarang, String beratBarang, String jenisPengiriman) {
        this.namaKirim = namaKirim;
        this.alamatKirim = alamatKirim;
        this.kotaKirim = kotaKirim;
        this.teleponKirim = teleponKirim;
        this.namaTerima = namaTerima;
        this.alamatTerima = alamatTerima;
        this.kotaTerima = kotaTerima;
        this.teleponTerima = teleponTerima;
        this.namaBarang = namaBarang;
        this.beratBarang = Float.parseFloat(beratBarang);
        this.jenisPengiriman = jenisPengiriman;
    }

    
    public void setBarang(){
        try {
            Login l = new Login();
            Model m = new Model();
            String sql = "INSERT INTO barang VALUES (null,'"+l.getId_login()+"','"+this.namaKirim+"','"+this.alamatKirim+"','"+this.kotaKirim+"','"+this.teleponKirim+"',"
                    + "'"+this.namaTerima+"','"+this.alamatTerima+"','"+this.kotaTerima+"','"+this.teleponTerima+"','"+this.namaBarang+"',"+this.beratBarang+",'"+this.jenisPengiriman+"','diproses')";
            m.updateData(sql);
        } catch (SQLException ex) {
            System.err.println("Error: setBarang() (Gagal diproses)");
        }
    }
    
    public ResultSet getBarangUser() throws SQLException{
            Login l = new Login();
            Model m = new Model();
            String sql = "SELECT * FROM barang WHERE id_user = '"+l.getId_login()+"'";
            return m.getData(sql);
    }
    
    public ResultSet getAllBarang() throws SQLException{
//            Login l = new Login();
            Model m = new Model();
            String sql = "SELECT * FROM barang";
            return m.getData(sql);
    }
}
