package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet {
	private String text;
	private Usuario usuario;
	private Tweet tweetOrigen;
	
	public Tweet(Usuario u, String text) {
		this.text = text;
		this.usuario = u;
		this.tweetOrigen = this;
	}
	
	public Tweet(Usuario u, Tweet to) {
		this.text = to.getText();
		this.usuario = u;
		this.tweetOrigen = to;
	}
	
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}
	
	public String getText() {
		return this.text;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
}
