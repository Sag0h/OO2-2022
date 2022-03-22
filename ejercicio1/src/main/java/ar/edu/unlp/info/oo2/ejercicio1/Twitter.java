package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.HashSet;
import java.util.Set;

public class Twitter {

	private Set<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new HashSet<>();
	}
	
	public void registrarUsuario(Usuario u) {
		this.usuarios.add(u);
	}

	public void eliminarUsuario(Usuario u) {
		this.usuarios.remove(u);
	}
	
	public void eliminarUsuario(String username) {
		this.usuarios.remove(this.usuarios.stream().filter(u -> u.getScreenName().equals(username)).findFirst().get());
	}
	
	public Set<Usuario> getUsuarios(){
		return this.usuarios;
	}
}
