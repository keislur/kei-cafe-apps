/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author KeimalST
 */
public class koneksi {
private String url="jdbc:mysql://localhost/c_keimal_d";
    private String username_xampp = "root";
    private String password_xampp = "";
    public Connection conn;
    public Statement cn;
    
    void connect(){
        try {
            conn = DriverManager.getConnection(url, username_xampp, password_xampp);
//            System.out.println("Koneksi Berhasil");
            cn = conn.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    public Connection getCon(){
        return conn;
    }
}