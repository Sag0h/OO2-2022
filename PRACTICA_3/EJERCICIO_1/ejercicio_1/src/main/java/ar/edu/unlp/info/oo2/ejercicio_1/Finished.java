package ar.edu.unlp.info.oo2.ejercicio_1;

import java.time.LocalDateTime;

public class Finished extends State {

	public Finished(ToDoItem t) {
		super("Finished");
		t.setFinishDate(LocalDateTime.now());
	}
	
	
}
