package Punto_2;


public class Producto {
    
    private String Nombre;
    private double Precio;

    public Producto(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
        
    
}
