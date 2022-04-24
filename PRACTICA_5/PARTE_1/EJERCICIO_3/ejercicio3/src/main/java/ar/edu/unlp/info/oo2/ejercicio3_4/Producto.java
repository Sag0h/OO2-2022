package ar.edu.unlp.info.oo2.ejercicio3_4;


public class Producto {
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
    	this.nombre = nombre;
    	this.precio = precio;
    }
    
    public double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
    	return this.nombre;
    }
}
