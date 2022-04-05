package ar.edu.unlp.info.oo2.ejercicio_1;

public class Paused implements State {

	public void togglePause(ToDoItem t) {
		t.setState(new InProgress());
	}

	public void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}
	
}
