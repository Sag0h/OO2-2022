package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements Exporter {

	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		String str = "";
		try {
			 str = mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
		
	}

}
