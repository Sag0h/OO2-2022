package ar.edu.unlp.info.oo2.ejercicio_1;

import java.time.LocalDateTime;

public class Pending extends State {

	public Pending() {
		super("Pending");
	}

	@Override
	public void start(ToDoItem toDo) {
		toDo.setStartDate(LocalDateTime.now());
		toDo.setState(new InProgress());
	}
	

}
