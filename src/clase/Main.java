/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import Salidad_Llegadas.Controlador.Controlador_Bitacora;
import Salidad_Llegadas.Modelo.Bitacora;
import Vehiculo.Controlador.controladorVehiculo;
import Vehivulo.Modelo.Vehículo;

/**
 *
 * @author Dinia Alvarado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Controlador_Bitacora prueba2 = new Controlador_Bitacora();
        //controladorVehiculo prueba = new controladorVehiculo();
        Bitacora g = new Bitacora(0, "", "",0,0,0,0,0,0,"");
        //Vehículo h = new Vehículo(0,"ABCD","rojo");
       // prueba.conectar();
        //prueba.Agregar(h);
        
        prueba2.conectar();
        prueba2.Agregar(g);
        
       
        
    }
}


