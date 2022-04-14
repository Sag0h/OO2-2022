package ar.edu.unlp.info.oo2.ejercicio_4;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private Year releaseYear;
	private float score;
	private List<Movie> similarMovies;
	
	public Movie(String t, Year y, float s, List<Movie> similar) {
		this.title = t;
		this.releaseYear = y;
		this.score = s;
		this.similarMovies = similar;
	}
	
	public Movie(String t, Year y, float s) {
		this.title = t;
		this.releaseYear = y;
		this.score = s;
		this.similarMovies = new ArrayList<Movie>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Year getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Year releaseYear) {
		this.releaseYear = releaseYear;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public List<Movie> getSimilarMovies(){
		return this.similarMovies;
	}
	
	public void addSimilarMovie(Movie m) {
		this.similarMovies.add(m);
	}
	
}
