package ar.edu.unlp.info.oo2.ejercicio3_3;

import java.time.LocalDate;

public class Post {
	private String texto;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Post(String texto, LocalDate fecha, Usuario usuario) {
		super();
		this.texto = texto;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public String getTexto() {
		return this.texto;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}

}
