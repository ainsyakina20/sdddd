/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.modul7.gui;
import java.sql.SQLException;

/**
 *
 * @author LABFIK
 */
public interface BarangIf {
    Barang insert(Barang o) throws SQLException;
    void update(Barang o) throws SQLException;
    void delete(String nama) throws SQLException;
}
