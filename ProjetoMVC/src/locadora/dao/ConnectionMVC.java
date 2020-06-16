/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author medua
 */
public class ConnectionMVC {
    
    public Connection getConnection(){
        Connection conn = null;
        
        try {
            Class.forName("conn");
        }catch(ClassNotFoundException e) { 
            
        }
        
        try {
            conn = DriverManager.getConnection(url, "root", "senha");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return conn;
    }
    
}
