/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

/**
 *
 * @author Natalia-Pc
 */
public class Arriendo {
    
    private String Direccion;
    private int Costo;

    public Arriendo(String Direccion, int Costo) {
        this.Direccion = Direccion;
        this.Costo = Costo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getCosto() {
        return Costo;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
    
}
