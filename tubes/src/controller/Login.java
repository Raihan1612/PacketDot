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
public class Login {
    private static String id_login;
    private String username;
    private String password;
    public static ResultSet result;

    public Login() {
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;   
    }
    
    public boolean loginSuccess() throws SQLException{
        String sql = "SELECT * FROM profile WHERE username = '"+this.username+"' AND password = '"+this.password+"'";
        Model m = new Model();
        result = m.getData(sql);   
        if (result.next()) {
            id_login = result.getString("id");
            return true;
         } else {
            return false;
         }
    }
    
    public String getId_login() {
        return id_login;
    }
    
    public ResultSet getUserData() throws SQLException{
        Model m = new Model();
        String sql = "SELECT * FROM profile WHERE id = '"+Login.id_login+"'";
        return m.getData(sql);
    }
    
    
    
}
