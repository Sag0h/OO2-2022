package ar.edu.unlp.info.oo2.ejercicio_3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CalculatorStrategy {
	private CRC32 crc;
	
	public CRC32_Calculator() {
		this.crc = new CRC32();
	}
	
	@Override
	public Integer crcFor(String data) {
		crc.update(data.getBytes());
		return (int) crc.getValue();

	}

}
