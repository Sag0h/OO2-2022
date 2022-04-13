package ar.edu.unlp.info.oo2.ejercicio_1;

public class InProgress extends State {

	public InProgress() {
		super("InProgress");
	}

	public void togglePause(ToDoItem t) {
		t.setState(new Paused());
	}

	public void finish(ToDoItem t) {
		t.setState(new Finished(t));
	}
	
}
