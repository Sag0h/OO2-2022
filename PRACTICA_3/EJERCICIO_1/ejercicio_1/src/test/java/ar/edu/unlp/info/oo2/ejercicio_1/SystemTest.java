/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
public class SystemTest {
	
	Client jira = new Client();
	ToDoItem t1;
	ToDoItem t2;
	
	@BeforeEach
	void setUp() throws Exception {
		t1 = new ToDoItem("t1");
		t2 = new ToDoItem("t2");
		jira.addToDoItem(t1);
		jira.addToDoItem(t2);;
}
    @Test
    public void testStates() {
    	t1.start();
    	assertEquals("ar.edu.unlp.info.oo2.ejercicio_1.InProgress",t1.getState().getClass().getName());
    	assertEquals("ar.edu.unlp.info.oo2.ejercicio_1.Pending", t2.getState().getClass().getName());
    	t1.togglePause();
    	assertEquals("ar.edu.unlp.info.oo2.ejercicio_1.Paused",t1.getState().getClass().getName());
    	t1.finish();
    	assertEquals("ar.edu.unlp.info.oo2.ejercicio_1.Finished",t1.getState().getClass().getName());
    }	
    
    @Test
    public void testAddComments() {
    	t1.start();
    	t1.addComment("comment1");
    	t1.addComment("comment2");
    	t1.finish();
    	t1.addComment("comment3");
    	assertEquals(2, t1.getComments().size());
    }
    
    @Test
    public void testThrows() {
    	boolean thrown = false;
    	try {
    		t1.workedTime();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    	
    	try {
    		t1.togglePause();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    	t1.finish();
    	try {
    		t1.togglePause();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    }
    	
    
}
