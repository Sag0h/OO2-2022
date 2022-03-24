package ar.edu.unlp.info.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	private List<Media> mediaFiles;
	
	public MediaPlayer() {
		mediaFiles = new ArrayList<Media>();
	}

	public void addMedia(Media m) {
		mediaFiles.add(m);
	}
	
	public List<Media> getMedia(){
		return mediaFiles;
	}
	
	public void playMedia(Media m) {
		m.play();
	}
	
}