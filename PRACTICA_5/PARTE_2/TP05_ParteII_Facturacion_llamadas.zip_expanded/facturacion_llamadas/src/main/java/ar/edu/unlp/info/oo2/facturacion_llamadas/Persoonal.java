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
	
	public Persoona registrarUsuario(String id, String nombre, String tipoDePersona) {
		Persoona persona = determinarTipoPersona(id, nombre, tipoDePersona);
		personas.add(persona);
		return persona;
		
	}

	private Persoona determinarTipoPersona(String id, String nombre, String tipoDePersona) {
		if (tipoDePersona.equals("fisica")) {
			return new PersoonaFisica(nombre, tipoDePersona, this.getNuevoNumeroTelefono(),id, this);
		}
		else if (tipoDePersona.equals("juridica")) {
			return new PersoonaJuridica(nombre, tipoDePersona, this.getNuevoNumeroTelefono(),id, this);
		}
		return null;
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		if (this.existeUsuario(persona)) {
			this.personas = personas.stream().filter(p -> p != persona).collect(Collectors.toList());
			this.guiaTelefonica.agregarNumero(persona.getTelefono());
			return true;
		}
		return false;
		
	}
	
	private Llamada crearLlamada(Persoona persona1, Persoona persona2, String tipo, int duracion) {
		if(tipo.toLowerCase() == "nacional") {
			return new LlamadaNacional(tipo, persona1.getTelefono(), persona2.getTelefono(), duracion);
		}else if(tipo.toLowerCase() == "internacional") {
			return new LlamadaInternacional(tipo, persona1.getTelefono(), persona2.getTelefono(), duracion);
		}
		return null;
	}
	
	public Llamada registrarLlamada(Persoona persona1, Persoona persona2, String tipo, int duracion) {
		Llamada llamada = crearLlamada(persona1, persona2, tipo, duracion);
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
