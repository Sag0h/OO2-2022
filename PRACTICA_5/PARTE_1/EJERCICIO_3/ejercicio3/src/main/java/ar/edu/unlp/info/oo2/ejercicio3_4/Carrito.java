package ar.edu.unlp.info.oo2.ejercicio3_4;

import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;
    
    public double total() {
    	return this.items.stream().mapToDouble(item -> item.calcularTotal()).sum();
    }
}
