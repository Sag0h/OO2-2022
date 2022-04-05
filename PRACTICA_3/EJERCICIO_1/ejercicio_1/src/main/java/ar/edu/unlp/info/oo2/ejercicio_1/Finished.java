package ar.edu.unlp.info.oo2.ejercicio_1;

import java.time.LocalDateTime;

public class Finished implements State {

	public Finished(ToDoItem t) {
		t.setFinishDate(LocalDateTime.now());
	}
	
	
}
