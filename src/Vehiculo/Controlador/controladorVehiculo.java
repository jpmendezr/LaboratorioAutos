/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Controlador;

import Grafica.FrameConfi;
import Vehivulo.Modelo.Vehículo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author juan1
 */
public class controladorVehiculo {
  
    private Connection conexion;
    
    private Statement sentencias;
    private ResultSet datos;
    
     public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehiculos?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
            
//            FrameConfi confi = new FrameConfi();
//            confi.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar");
            //System.out.println(" Error al conectar");
        }
    }
    
    public void Agregar (Vehículo carro){
        try {
            
            this.sentencias.executeUpdate("insert into vehiculos values(null,'"+carro.getId()+","+carro.getPlaca()+"','"+carro.getDescripcion()+"')",Statement.RETURN_GENERATED_KEYS);
            this.datos = this.sentencias.getGeneratedKeys();
            if (datos.next()) {
                
                System.out.println(datos.getInt(1));
                System.out.println(" se agrego de manera exitosa");
                
            }
        } catch (SQLException ex) {
            System.out.println("Error al agregar");
        }
        
        
    }
    
}
