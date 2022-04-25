package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	public SortedSet<String> guia = new TreeSet<String>();
	
	public boolean existeNumero(String num) {
		return this.guia.contains(num);
	}
	
	public boolean agregarNumero(String num) {
		if (!this.existeNumero(num)) {
			this.guia.add(num);
			return true;
		}
		return false;
	}
	
	public String getUltimoNumeroYEliminarloDeGuia() {
		String tel = this.guia.last();
		this.guia.remove(tel);
		return tel;
	}
	
}
