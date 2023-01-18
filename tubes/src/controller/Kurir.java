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
public class Kurir {
    private int id_kurir;
    private Object id_barang;
    private String status;
    Login l = new Login();

    public Kurir() {
    }

    public Kurir(Object id_barang) {
        this.id_barang = id_barang;
    }
    
    public Kurir(int id_kurir, Object id_barang, String status) {
        this.id_kurir = id_kurir;
        this.id_barang = id_barang;
        this.status = status;
    }
    
    public ResultSet getPaket(){
        ResultSet result = null;
        try {
            Model m = new Model();
            String sql = "SELECT * FROM barang WHERE status != 'diterima'";
            result = m.getData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Kurir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public ResultSet getPaketAcc(){
        ResultSet result = null;
        try {
            Model m = new Model();
            String sql = "SELECT * FROM shipment INNER JOIN barang ON barang.id = shipment.id_barang WHERE shipment.id_kurir = "+l.getId_login()+" AND shipment.status = 'acc'";
            result = m.getData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Kurir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public boolean setAmbilBarang(){
        boolean flag = false;
        try {
            Model m = new Model();
            String sql = "INSERT INTO shipment VALUES (null, "+id_kurir+", "+id_barang+", 'pending')";
            if ("diproses".equals(this.status)){
                m.updateData(sql);
                flag = true;
                sql = "UPDATE barang SET status = 'diprose kurir' WHERE id = "+id_barang;
                m.updateData(sql);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kurir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public void paketSelesai(){
        try {
            Model m = new Model();
            String sql = "UPDATE barang SET status = 'diterima' WHERE id = '"+this.id_barang+"'";
            m.updateData(sql);
            sql = "UPDATE shipment SET status = 'selesai' WHERE id_barang = '"+this.id_barang+"'";
            m.updateData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Kurir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
