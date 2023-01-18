/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
/**
 *
 * @author USER
 */
public class Model {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/packet_dot";
    private static final String user = "root";
    private static final String password = "";
    private Connection konek;
    private Statement state;
    private ResultSet rs;

    public Model() throws SQLException{
        try{
            Class.forName(driver);
            konek = DriverManager.getConnection(url, user, password);
            state = konek.createStatement();
//            System.out.println("Berhasil");
        } catch (Exception e){
            System.err.println("Error"+e);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = state.executeQuery(SQLString);
//            System.out.println("Berhasil");
        }catch (Exception e){
            System.err.println("Error:"+e);
        }
        return rs;
    }
    
    public void updateData(String SQLString){
        try{
            state.executeUpdate(SQLString);
        } catch (Exception e){
            System.err.println("Error:"+e);
        }
    }  
}
