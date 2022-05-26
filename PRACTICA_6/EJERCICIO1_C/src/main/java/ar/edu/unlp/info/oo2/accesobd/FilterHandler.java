package ar.edu.unlp.info.oo2.accesobd;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FilterHandler extends Handler {
	private Handler handler;
	private List<String> wordsToFilter;
	
	public FilterHandler(Handler h, List<String> wtf) {
		this.handler = h;
		this.wordsToFilter = wtf;
	}
	
	public FilterHandler(Handler h) {
		this.handler = h;
		this.wordsToFilter = new ArrayList<String>();
	}
	
	@Override
	public void publish(LogRecord record) {
		String msg = record.getMessage();
		for(String word: wordsToFilter) {
			if(msg.contains(word)) {
				msg = msg.replace(word.toString(), "***");
			}
		}
		record.setMessage(msg);
		this.handler.publish(record);
	}

	public void addWordToFilter(String word) {
		this.wordsToFilter.add(word);
	}
	
	@Override
	public void flush() {
		this.handler.flush();
	}

	public void setFormatter(Formatter f) {
		this.handler.setFormatter(f);
	}
	
	@Override
	public void close() throws SecurityException {
		this.handler.flush();
	}

}
