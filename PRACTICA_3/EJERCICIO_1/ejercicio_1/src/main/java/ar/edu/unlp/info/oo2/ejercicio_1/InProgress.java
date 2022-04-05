package ar.edu.unlp.info.oo2.ejercicio_1;

public class InProgress implements State {

	public void togglePause(ToDoItem t) {
		t.setState(new Paused());
	}

	public void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}
	
}
