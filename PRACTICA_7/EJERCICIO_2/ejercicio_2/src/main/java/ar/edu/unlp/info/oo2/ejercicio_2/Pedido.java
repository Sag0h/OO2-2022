package ar.edu.unlp.info.oo2.ejercicio_2;

public class Pedido {
	private Cliente cliente;
	private double monto;
	
	public Pedido(Cliente cliente, double monto) {
		this.monto = monto;
		this.cliente = cliente;
	}
	
	public double monto() {
		return this.monto;
	}
	
	public boolean pagarCon(GatewayAdapter medio) {
		return medio.pagar(cliente, this.monto);
	}
	
}
