/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4.modul7.gui;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author LABFIK
 */
public class BarangImp implements BarangIf {
    @Override
    public Barang insert(Barang o) throws SQLException {
        PreparedStatement st = KoneksiDatabase.getKoneksi().prepareStatement("insert into barang values (?,?,?) ");
        st.setString(1, o.getNama());
        st.setLong(2, o.getHarga());
        st.setLong(3, o.getJumlah());
        st.executeUpdate();
        return o;
    }
 
    @Override
    public void update(Barang o) throws SQLException {
        PreparedStatement st = KoneksiDatabase.getKoneksi().prepareStatement("update barang set harga=?, jumlah=? where nama=?");
        st.setLong(1, o.getHarga());
        st.setLong(2, o.getJumlah());
        st.setString(3, o.getNama());
        st.executeUpdate();
     }
 
    @Override
    public void delete(String nama) throws SQLException {
        PreparedStatement st = KoneksiDatabase.getKoneksi().prepareStatement("delete from barang where nama=?");
        st.setString(1, nama);
        st.executeUpdate();
    }
}
