package ar.edu.unlp.info.oo2.ejercicio_2;
import ar.edu.unlp.info.oo2.ejercicio_2.APIs.*;

public class DebitoGatewayAdapter implements GatewayAdapter {
	private DebitoGateway gateway = new DebitoGateway();
	@Override
	public boolean pagar(Cliente cliente, double monto) {
		if(gateway.autorizarMontoConCBU(monto, cliente.getCBU()).isEmpty()) {
			gateway.pagarMontoConCBU(monto, cliente.getCBU());
			return true;
		}
		return false;
	}

}
