package ar.edu.unlp.info.oo2.ejercicio1;

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
                this.tweets.removeAll();
                return null;
        }

	public Tweet tweetear(String t) {
		if(t.length() > 0 && t.length() <= 140) {
		      Tweet tw = new Tweet(t, this);
                      this.tweets.add(tw);
                      return tw;

		}

		return null;
	}
	
	public Tweet retweetear(String text, Tweet t) {
                if(text.length() > 0 && text.length() <= 140) { 
                        Tweet tw = new Tweet(text, t);
                        this.tweets.add(tw);
		        return tw;
                }
                return null;
	}
	
}
