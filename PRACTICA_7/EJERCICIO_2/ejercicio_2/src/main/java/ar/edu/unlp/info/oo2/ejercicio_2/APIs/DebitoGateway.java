package ar.edu.unlp.info.oo2.ejercicio_2.APIs;

import java.util.ArrayList;

public class DebitoGateway {
	private double monto = 900;
	
	public ArrayList<String> autorizarMontoConCBU(double unMonto, String cbu){
		ArrayList<String> list = new ArrayList<String>();
		if((monto - unMonto) < 0) {
			list.add("saldo insuficiente");
		}
		return list;
		
	}
	
	public void pagarMontoConCBU(double unMonto, String cbu) {
		this.monto -= unMonto;
	}
	
}
