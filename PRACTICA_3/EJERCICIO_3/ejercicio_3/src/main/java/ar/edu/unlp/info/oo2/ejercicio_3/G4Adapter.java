package ar.edu.unlp.info.oo2.ejercicio_3;

public class G4Adapter implements Connection {
	private G4Connection connection;
	
	public G4Adapter() {
		this.connection = new G4Connection();
	}
	
	@Override
	public String sendData(String data, Integer crc) {
		return connection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return connection.getSymb();
	}

}
