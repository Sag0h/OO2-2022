package ar.edu.unlp.info.oo2.ejercicio1;

public class VideoStreamAdapter implements Media {
	private VideoStream video;
	
	public VideoStreamAdapter(VideoStream video) {
		this.video = video;;
	}
	
	@Override
	public void play() {
		video.reproduce();
	}

}
