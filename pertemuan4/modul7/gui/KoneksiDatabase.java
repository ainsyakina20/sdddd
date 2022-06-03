/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.modul7.gui;

import java.sql.*;
/**
 *
 * @author LABFIK
 */
public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_aplikasipenjualan", "root", "");
            } catch (SQLException se) {
            
            }
        }
        return koneksi;
    }
    
    public static void main(String[] args){
        getKoneksi();
    }
}
