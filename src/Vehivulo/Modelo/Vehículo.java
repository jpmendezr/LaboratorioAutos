/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehivulo.Modelo;

/**
 *
 * @author juan1
 */
public class Vehículo {
    private int id;
    private String placa;
    private String descripcion;

    public Vehículo(String placa) {
        this.id = 0;
        this.placa = placa;
        this.descripcion = null;
    }

    public Vehículo(int id,String placa,String descripcion) {
        this.id = id;
        this.placa = placa;
        this.descripcion = descripcion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   
    
    public boolean Comprobar(){
        if ( !this.placa.equals(" ")&& this.descripcion.equals(" ") ){
            return true;      
        }
        return false;
    }
    
}
