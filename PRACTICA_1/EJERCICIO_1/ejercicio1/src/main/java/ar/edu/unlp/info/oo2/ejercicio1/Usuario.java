package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;

	public Usuario(String name) {
		this.screenName = name;
        this.tweets = new ArrayList<Tweet>();
	}
	
	public String getScreenName() {
		return screenName;
	}

	public List<Tweet> eliminarTweets(){
    	this.tweets.clear();;
    	return this.tweets;
	}

	public Tweet tweetear(String t) {
		if(t.length() > 0 && t.length() <= 140) {
			Tweet tw = new Tweet(t);
            this.tweets.add(tw);
            return tw;

		}
		return null;
	}
	
	public Tweet retweetear(String text, Tweet t) {
		if(text.length() <= 140) { 
			Tweet tw = new Tweet(text, t);
            this.tweets.add(tw);
            return tw;
		}
        return null;
	}
	
	public Tweet retweetear(Tweet t) {
		return this.retweetear("", t);		
	}
	
}
