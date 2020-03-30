/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

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
            
      
        controladorVehiculo prueba = new controladorVehiculo();
        Vehículo h = new Vehículo(0,"ABCD","rojo");
        prueba.conectar();
        prueba.Agregar(h);
    }
}


