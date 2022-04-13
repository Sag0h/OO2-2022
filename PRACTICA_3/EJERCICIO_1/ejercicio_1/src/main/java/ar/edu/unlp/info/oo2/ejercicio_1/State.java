package ar.edu.unlp.info.oo2.ejercicio_1;

public abstract class State {
	protected String name;
	
	public State(String n) {
		this.name = n;
	}
	
	public void start(ToDoItem toDo) {
		
	}
	
	public void togglePause(ToDoItem toDo) {
		throw new RuntimeException("Actual state is "+ this.name +", can't pause.");
	}
	
	public void finish(ToDoItem toDo) {
		
	}

	public String getName() {
		return name;
	}

	
}
