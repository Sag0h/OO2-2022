package ar.edu.unlp.info.oo2.accesobd;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import org.json.simple.JSONObject;

public class JSONFormatter extends Formatter {

	
	@SuppressWarnings("unchecked")
	@Override
	public String format(LogRecord record) {
		 JSONObject data = new JSONObject();
		 data.put("message", record.getMessage());
		 data.put("level", record.getLevel());
		 return data.toJSONString();
	}

}
