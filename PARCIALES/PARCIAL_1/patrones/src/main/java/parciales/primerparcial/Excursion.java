package parciales.primerparcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> listaInscriptos;
	private List<Usuario> listaEspera;
	private Estado estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMin, int cupoMax) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.listaEspera = new ArrayList<Usuario>();
		this.listaInscriptos = new ArrayList<Usuario>();
		this.estado = new Provisoria(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public void setCupoMin(int cupoMin) {
		this.cupoMin = cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}

	public List<Usuario> getListaInscriptos() {
		return listaInscriptos;
	}

	public List<Usuario> getListaEspera() {
		return listaEspera;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getInfoBasica() {
		return "Nombre: " + this.getNombre()+
				" Costo: $" + this.getCosto() +
				" Fecha Inicio: "+ this.getFechaInicio().toString()+
				" FechaFin: "+ this.getFechaFin().toString()+
				" Punto de encuentro:  "+ this.getPuntoEncuentro();
	}
	
	public void inscribir(Usuario usuario) {
		this.estado.inscribir(usuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion();
	}


	public boolean alcanzoCupoMinimo() {
		// TODO Auto-generated method stub
		return this.listaInscriptos.size() >= this.getCupoMin();
	}

	public boolean alcanzoCupoMaximo() {
		// TODO Auto-generated method stub
		return  this.getListaInscriptos().size() >= this.getCupoMax();
	}
	
	public int getCantidadFaltanteCupoMinimo() {
		return this.getCupoMin() - this.listaInscriptos.size();
	}
	
	public int getCantidadFaltanteCupoMaximo() {
		return this.getCupoMax() - this.listaInscriptos.size();
	}

	public String getMailInscriptos() {
		String aux = "";
		listaInscriptos.stream().forEach(u -> aux.concat(u.getEmail() +" \n"));
		return aux;
	}
	
	
}
