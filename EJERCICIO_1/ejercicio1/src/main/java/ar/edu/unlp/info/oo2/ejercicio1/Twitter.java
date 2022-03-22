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
		Usuario u = this.usuarios.stream().filter(c -> c.getScreenName().equals(username)).findAny().orElse(null);
		if( u != null ) {
			this.usuarios.remove(u);
		}
	}
	
	public Set<Usuario> getUsuarios(){
		return this.usuarios;
	}
}
