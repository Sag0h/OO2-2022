package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class VoorheesExporter implements Exporter{
	private Exporter exporter = new JacksonAdapter(); // new JSONsimpleAdapter();
	
	public String exportar(List<Socio> socios) {
		return exporter.exportar(socios);
	}
}
