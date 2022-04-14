package ar.edu.unlp.info.oo2.ejercicio_3;

public class WifiConn implements Connection {
	private String pict;
	
	public WifiConn(String pict) {
		this.pict = pict;
	}
	
	public WifiConn() {
		this.pict = "WIFI SYMB";
	}
	
	@Override
	public String sendData(String data, Integer crc) {
		return "transmitting data";
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
