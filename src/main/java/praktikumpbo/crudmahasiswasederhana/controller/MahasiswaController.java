/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.crudmahasiswasederhana.controller;

import crudmahasiswasederhana.interfc.MahasiswaInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import praktikumpbo.crudmahasiswasederhana.db.connectionHelper;
import praktikumpbo.crudmahasiswasederhana.models.Mahasiswa;

/**
 *
 * @author andik
 */
public class MahasiswaController implements MahasiswaInterface{
    PreparedStatement st;

    @Override
    public Mahasiswa insert(Mahasiswa o) throws SQLException {
        st = connectionHelper.getConnection().prepareStatement(
                "insert into mahasiswa values(?,?,?)");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3,o.getAlamat());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Mahasiswa o) throws SQLException {
        st = connectionHelper.getConnection().prepareStatement(
                "update mahasiswa set nama=?, alamat=?, where nime=?");
        st.setString(1, o.getNim());
        st.setString(2, o.getNama());
        st.setString(3,o.getAlamat());
        st.executeUpdate();
    }
        
    public void delete(Mahasiswa o) throws SQLException {
        st=connectionHelper.getConnection().prepareStatement(
                "delete from mahasiswa where nim=?");
        String nim = null;
        st.setString(1, nim);
        st.executeUpdate();
    }

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        Statement st=connectionHelper.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from mahasiswa");
        List<Mahasiswa>list=new ArrayList<Mahasiswa>();
        while(rs.next()){
            Mahasiswa mhs= new Mahasiswa();
            mhs.setNim(rs.getString("nim"));
            mhs.setNama(rs.getString("nama"));
            mhs.setAlamat(rs.getString("alamat"));
            list.add(mhs);
        }
        return list;
    }   

    @Override
    public void delete(String nim) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
