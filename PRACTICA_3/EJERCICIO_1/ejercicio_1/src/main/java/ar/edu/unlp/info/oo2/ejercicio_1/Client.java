package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<ToDoItem> toDoItems;
	
	public Client() {
		this.toDoItems = new ArrayList<ToDoItem>();
	}
	
	public Client(List<ToDoItem> list) {
		this.toDoItems = list;
	}
	
	public void addToDoItem(ToDoItem t) {
		this.toDoItems.add(t);
	}
	
	public List<ToDoItem> getToDoItems(){
		return this.toDoItems;
	}
	
}
