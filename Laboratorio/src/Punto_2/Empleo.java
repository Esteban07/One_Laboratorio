package Punto_2;

import java.util.Calendar;
import java.util.Date;

public class Empleo {
    
    private String Nombre;
    private double Salario;
    private Date Entrada;
    private Date Salida;
    private Calendar FechaIN;
    private Calendar FechaOUT;
    private Persona Persona;

    public Empleo(String Nombre, double Salario, Date Entrada, Date Salida, Calendar FechaIN, Calendar FechaOUT, Persona Persona) {
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.FechaIN = FechaIN;
        this.FechaOUT = FechaOUT;
        this.Persona = Persona;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setEntrada(Date Entrada) {
        this.Entrada = Entrada;
    }

    public void setSalida(Date Salida) {
        this.Salida = Salida;
    }

    public void setFechaIN(Calendar FechaIN) {
        this.FechaIN = FechaIN;
    }

    public void setFechaOUT(Calendar FechaOUT) {
        this.FechaOUT = FechaOUT;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public Date getEntrada() {
        return Entrada;
    }

    public Date getSalida() {
        return Salida;
    }

    public Calendar getFechaIN() {
        return FechaIN;
    }

    public Calendar getFechaOUT() {
        return FechaOUT;
    }

    public Persona getPersona() {
        return Persona;
    }
    
    
}
