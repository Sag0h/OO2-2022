package ar.edu.unlp.info.oo2.ejercicio_2;
import ar.edu.unlp.info.oo2.ejercicio_2.APIs.*;

public class DebitoGatewayAdapter implements GatewayAdapter {
	private DebitoGateway gateway = new DebitoGateway();
	@Override
	public boolean pagar(Cliente cliente, double monto) {
		if(gateway.autorizarMontoConCBU(monto, "123").isEmpty()) {
			gateway.pagarMontoConCBU(monto, "123");
			return true;
		}
		return false;
	}

}
