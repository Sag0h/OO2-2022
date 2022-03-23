package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONsimpleAdapter implements Exporter{
	
	private String readJSONObject(Socio s) {
		 JSONObject data = new JSONObject();
		 data.put("nombre", s.getNombre());
		 data.put("email", s.getEmail());
		 data.put("legajo", s.getLegajo());
		 return data.toJSONString();
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray sociosArray = new JSONArray();
		
		for(Socio s: socios) {
			sociosArray.add(this.readJSONObject(s));
		}
		return sociosArray.toJSONString();
	}




	
}
