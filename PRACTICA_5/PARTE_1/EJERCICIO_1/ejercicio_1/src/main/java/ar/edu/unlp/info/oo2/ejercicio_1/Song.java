package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Song extends Content{
	
	public Song(String name) {
		super(name);
	}

	public List<Song> search(String s) {
		List<Song> l = new ArrayList<Song>();
		if(this.isInOrEqual(s)) {
			l.add(this);
		}
		return l;
	}

	public String getName() {
		return this.name;
	}
}

