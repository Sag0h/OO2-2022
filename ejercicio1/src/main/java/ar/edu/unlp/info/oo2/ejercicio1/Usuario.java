package ar.edu.unlp.info.oo2.ejercicio1;

public class Usuario {
	private String screenName;
	
	public Usuario(String name) {
		this.screenName = name;
	}
	
	public String getScreenName() {
		return screenName;
	}

	public Tweet tweetear(String t) {
		if(t.length() > 0 && t.length() <= 140) {
			return new Tweet(this ,t);
		}
		return null;
	}
	
	public Tweet retweetear(Tweet t) {
		return new Tweet(this, t);
	}
	
}
