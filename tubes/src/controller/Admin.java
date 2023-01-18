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
public class Admin {
    private String id_shipment;

    public Admin() {
    }

    public Admin(String id_shipment) {
        this.id_shipment = id_shipment;
    }
    
    public ResultSet getPaketPending(){
        ResultSet result = null;
        try {
            Model m = new Model();
            String sql = "SELECT * FROM shipment INNER JOIN barang ON barang.id = shipment.id_barang WHERE shipment.status = 'pending'";
            result = m.getData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public void setAccPaket(){
        try {
            Model m = new Model();
            String sql = "UPDATE shipment SET status = 'acc' WHERE id_shipment = '"+this.id_shipment+"'";
            m.updateData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
