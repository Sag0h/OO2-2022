package ar.edu.unlp.info.oo2.ejercicio_2;
import ar.edu.unlp.info.oo2.ejercicio_2.APIs.*;

public class DineroMailGatewayAdapter implements GatewayAdapter {
	private DineroMailGateway gateway = new DineroMailGateway();
	
	@Override
	public boolean pagar(Cliente cliente, double monto) {
		return this.gateway.realizarPagoParaMail(cliente.getEmail(), monto);
	}

}
