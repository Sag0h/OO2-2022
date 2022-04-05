package ar.edu.unlp.info.oo2.ejercicio_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private State state;
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime finishDate;
	private List<String> comments;
	
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.startDate = null;
		this.finishDate = null;
		this.comments = new ArrayList<String>();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getComments(){
		return this.comments;
	}
	
	public String getName() {
		return this.name;
	}
	
	public State getState() {
		return this.state;
	}
	
	public LocalDateTime getDateStart() {
		return this.startDate;
	}
	
	public void setStartDate(LocalDateTime d) {
		this.startDate = d;
	}
	public LocalDateTime getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDateTime finishDate) {
		this.finishDate = finishDate;
	}
	
	public LocalDateTime getStartDate() {
		return this.startDate;
	}
	
	public void start() {
		this.state.start(this);
	}
	
	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}

	public Duration workedTime() {
		if(this.getDateStart() == null) {
			throw new RuntimeException("Actual State Pending.");
		}
		if(this.getFinishDate() != null) {
			return Duration.between(this.getDateStart(), this.getFinishDate());
		}
		return Duration.between(this.getDateStart(), LocalDateTime.now());
	}
	
	public void addComment(String comment) {
		if(this.finishDate == null) {
			this.comments.add(comment);
		}
	}

}


