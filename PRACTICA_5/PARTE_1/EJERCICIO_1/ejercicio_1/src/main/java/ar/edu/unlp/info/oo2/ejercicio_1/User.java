package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private List<Song> myMusic;
	

	public User(String name) {
		this.name = name;
		this.myMusic = new ArrayList<Song>();
	}
	
	public String getName() {
		return this.name;
	}

    public void setName(String name){
        this.name = name;
    }

	public void addSong(Song song){
		this.myMusic.add(song);
	}
    
    public void deleteSong(String song){
        this.myMusic.removeIf(t -> t.getName().equals(song));
    }

}
