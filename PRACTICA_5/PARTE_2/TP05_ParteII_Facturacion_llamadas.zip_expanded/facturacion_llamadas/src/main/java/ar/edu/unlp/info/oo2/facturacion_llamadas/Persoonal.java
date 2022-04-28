package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	
	
	public boolean agregarTelefono(String num) {
		return guiaTelefonica.agregarNumero(num);
	}
	
	public String getNuevoNumeroTelefono() {
		return this.guiaTelefonica.getUltimoNumeroYEliminarloDeGuia();
	}
	
	public Persoona registrarUsuario(Persoona persona) {
		persona.setTelelfono(this.getNuevoNumeroTelefono());
		persona.setSistema(this);
		personas.add(persona);
		return persona;
		
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		if (this.existeUsuario(persona)) {
			this.personas = personas.stream().filter(p -> p != persona).collect(Collectors.toList());
			this.guiaTelefonica.agregarNumero(persona.getTelefono());
			return true;
		}
		return false;
		
	}

	
	public Llamada registrarLlamada(Persoona persona1, Persoona persona2, TipoDeLlamada tipo, int duracion) {
		Llamada llamada = new Llamada(tipo, persona1.getTelefono(), persona2.getTelefono(), duracion);
		this.llamadas.add(llamada);
		persona1.agregarLlamada(llamada);
		return llamada;	
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		return p.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
