/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_rumah.koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Kyy
 */
public class koneksi {
    
    static Connection con;
    
    public static Connection connection(){
        
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("jualrumah");
            data.setUser("root");
            data.setPassword("");
            try{
                con = (Connection) data.getConnection();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        
        return con;
    }
}
