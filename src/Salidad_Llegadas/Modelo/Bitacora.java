/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salidad_Llegadas.Modelo;

/**
 *
 * @author Dinia Alvarado
 */
public class Bitacora {
    private int ID;
    private String Placa;
    private String Destino;
    private int FechaSalida;
    private int FechaLlegada;
    private int HoraSalida;
    private int HoraLlegada;
    private int Kfinal;
    private int Kinicial;

    public void setKinicial(int Kinicial) {
        this.Kinicial = Kinicial;
    }

    public int getKinicial() {
        if ( this.Kinicial> this.Kfinal){
            return Kinicial;
        }
        return Kfinal;
                    
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public void setFechaSalida(int FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public void setFechaLlegada(int FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public void setHoraSalida(int HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public void setHoraLlegada(int HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public void setKfinal(int Kfinal) {
        this.Kfinal = Kfinal;
    }

    public int getID() {
        return ID;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getDestino() {
        return Destino;
    }

    public int getFechaSalida() {
        if (this.FechaSalida>this.FechaLlegada){
            return FechaSalida;
        }
        return FechaLlegada;
        
    }

    public int getFechaLlegada() {
        if ( this.FechaLlegada > FechaSalida){
            return FechaLlegada;
            
        }
        return FechaSalida;
        
    }

    public int getHoraSalida() {
        return HoraSalida;
    }

    public int getHoraLlegada() {
        return HoraLlegada;
    }

    public int getKfinal() {
        if ( this.Kfinal> this.Kinicial){
            return Kfinal;
            
        }
        return Kinicial;
        
    }

    public Bitacora() {
        this.ID = 0;
        this.Placa = " ";
        this.Destino = " ";
        this.FechaSalida = 0;
        this.FechaLlegada = 0;
        this.HoraSalida = 0;
        this.HoraLlegada = 0;
        this.Kfinal = 0;
        this.Kinicial = 0;
    }

    public Bitacora(int ID, String Placa, String Destino, int FechaSalida, int FechaLlegada, int HoraSalida, int HoraLlegada, int Kfinal, int Kinicial) {
        this.ID = ID;
        this.Placa = Placa;
        this.Destino = Destino;
        this.FechaSalida = FechaSalida;
        this.FechaLlegada = FechaLlegada;
        this.HoraSalida = HoraSalida;
        this.HoraLlegada = HoraLlegada;
        this.Kfinal = Kfinal;
        this.Kinicial = Kinicial;
    }

    public Bitacora(String Placa) {
        this.Placa = " ABC";
           
    }
    
    public boolean Comprobar(){
        if ( ! this.Destino.equals(" ")&& this.Placa.equals(" ") && this.FechaSalida==0 && this.HoraSalida==0 && this.Kinicial==0){
            return true;
            
        }
        return false;
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
