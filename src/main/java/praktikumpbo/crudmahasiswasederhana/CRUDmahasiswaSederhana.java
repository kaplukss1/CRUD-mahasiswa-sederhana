/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikumpbo.crudmahasiswasederhana;

import crudmahasiswasederhana.views.mahasiswaFrame;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import praktikumpbo.crudmahasiswasederhana.db.connectionHelper;

/**
 *
 * @author andik
 */
public class CRUDmahasiswaSederhana {

    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                mahasiswaFrame from = new mahasiswaFrame();
                from.setLocationRelativeTo(null);
                from.setVisible(true);
            }
        });
    }
}
