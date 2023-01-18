/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import model.Model;

/**
 *
 * @author USER
 */
public class Register {
    private String nama;
    private String telepon;
    private String alamat;
    private String kota;
    private String username;
    private String password;
    private String role;

    public Register(String nama, String telepon, String alamat, String kota, String username, String password, String role) {
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
        this.kota = kota;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public void setRegister() throws SQLException {
        Model m = new Model();
        String sql = "INSERT INTO profile VALUES (null,'"+this.nama+"','"+this.telepon+"','"+this.alamat+"','"+this.kota+"','"+this.username+"','"+this.password+"','"+this.role+"')";
        m.updateData(sql);
    }
    
    public boolean checkUsername() throws SQLException{
        Model m = new Model();
        String sql = "SELECT * FROM profile WHERE username = '"+this.username+"'";
        ResultSet result = m.getData(sql);
        return result.next();
    }
}
