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
public class User {
    private String id_user;
    
    public User() {
    }

    public User(String id_user) {
        this.id_user = id_user;
    }
    
    public ResultSet getAllUser
        
        
        (){
        ResultSet result = null;
        try {
            Model m = new Model();
            String sql = "SELECT * FROM profile WHERE role = 'user'";
            result = m.getData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public void deleteuser(){
        try {
            Model m = new Model();
            String sql = "DELETE FROM profile WHERE id = '"+this.id_user+"'";
            m.updateData(sql);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
