package ar.edu.unlp.info.oo2.ejercicio1;

public class Tweet {
	private String text;
	private Tweet tweetOrigen;

	
	public Tweet(String text, Tweet to) {
		this.text = text;
		this.tweetOrigen = to;
	}
	
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}
	
	public String getText() {
		return this.text;
	}
	
}
