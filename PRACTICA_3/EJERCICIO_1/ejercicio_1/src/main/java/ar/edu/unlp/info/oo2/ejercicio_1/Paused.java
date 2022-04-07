package ar.edu.unlp.info.oo2.ejercicio_1;

public class Paused extends State {
	
	public Paused() {
		super("Paused");
	}

	public void togglePause(ToDoItem t) {
		t.setState(new InProgress());
	}

	public void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}
	
}
