package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album extends Content{

	private List<Song> songs;
	

	public Album(String name) {
		super(name);
		this.songs = new ArrayList<Song>();
	}
    
	public Album(String name, List<Song> songs) {
		super(name);
        this.songs = songs;
	}
	
	public String getName() {
		return this.name;
	}

    public void setName(String name){
        this.name = name.toLowerCase();
    }

    public void addSong(Song s){
        this.songs.add(s);
    }

    public List<Song> getSongs(){
        return this.songs;
    }

    public List<Song> search(String s){
    	if(this.isInOrEqual(s)){
        	return this.getSongs();
		}
    	return this.songs.stream().flatMap(song -> song.search(s).stream()).collect(Collectors.toList());
    }

}
