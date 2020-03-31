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

    //Vehículo auto=new Vehículo();
    
    private Connection conexion;
    private Statement sentencias;
    private ResultSet datos;

    public void conectar() {
        try {
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/vehículos?useServerPrepStmts=true", "root", "");
            this.sentencias = this.conexion.createStatement();
//            FrameConfi confi = new FrameConfi();
//            confi.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al conectar");
            //System.out.println(" Error al conectar");
        }
    }

    public boolean Agregar(Vehículo auto) {
        try {
            this.sentencias.executeUpdate("insert into vehiculos values(null,'" + auto.getId() + "," + auto.getPlaca() + "','" + auto.getDescripcion() + "')", Statement.RETURN_GENERATED_KEYS);
            this.datos = this.sentencias.getGeneratedKeys();
            if (datos.next()) {

                System.out.println(datos.getInt(1));
                System.out.println(" se agrego de manera exitosa");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al agregar");
            return false;
        }
        return false;

    }

    public boolean buscar(int id) {
        try {
            this.datos = this.sentencias.executeQuery("select * from vehiculos where id=" + id);//jala todos los registros que el id diga
            if (datos.next()) {
                System.out.println(datos.getInt(1));
                System.out.println(datos.getString(2));
                System.out.println(datos.getString(3));
            } else {
                System.out.println("fin de los datos");
            }
        } catch (SQLException ex) {
            System.out.println("error en el read");
        }
        return false;
    }

    public boolean update(int id, String placa, String descripcion) {
        try {

            this.sentencias.executeUpdate("update vehiculos set nombre='" + placa + "' ,ciudad='" + descripcion + "' where id=" + id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Error en update");
            return false;
        }
    }
}
