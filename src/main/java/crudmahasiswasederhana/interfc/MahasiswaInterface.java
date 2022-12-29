/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudmahasiswasederhana.interfc;

import java.sql.SQLException;
import praktikumpbo.crudmahasiswasederhana.models.Mahasiswa;
import java.util.List;

/**
 *
 * @author andik
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    void delete (String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;

    
}