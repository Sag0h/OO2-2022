package ar.edu.unlp.info.oo2.biblioteca;


import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	Biblioteca biblio;
	Socio arya;
	Socio tyron;
	
	@BeforeEach
	public void setUp() throws Exception{
		biblio = new Biblioteca();
		arya = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblio.agregarSocio(arya);
		biblio.agregarSocio(tyron);
	}

	@Test
	public void testBiblioteca() {
		System.out.println(biblio.exportarSocios());
		Object obj = JSONValue.parse(biblio.exportarSocios());
		JSONArray array = (JSONArray)obj;
		
		ArrayList<Socio> arregloprueba = new ArrayList<Socio>();
		
		arregloprueba.add(arya);
		arregloprueba.add(tyron);
		
		for(int i = 0; i < array.size(); i++) {
			JSONObject pos = (JSONObject)array.get(i);
			Assertions.assertEquals(pos.get("nombre"), arregloprueba.get(i).getNombre());
			Assertions.assertEquals(pos.get("email"), arregloprueba.get(i).getEmail());
			Assertions.assertEquals(pos.get("legajo"), arregloprueba.get(i).getLegajo());
		}
			
	}
	
}
