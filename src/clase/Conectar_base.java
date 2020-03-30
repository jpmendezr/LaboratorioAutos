/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import Grafica.FrameConfi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinia Alvarado
 */
public class Conectar_base {

    private Connection conexion;
    private Statement sentencias;

    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculos?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            FrameConfi confi = new FrameConfi();
            confi.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar");
            //System.out.println(" Error al conectar");
        }
    }
    
    
}
