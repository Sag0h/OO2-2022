/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    	assertEquals("InProgress",t1.getState().getName());
    	assertEquals("Pending", t2.getState().getName());
    	t1.togglePause();
    	assertEquals("Paused",t1.getState().getName());
    	t1.togglePause();
    	assertEquals("InProgress",t1.getState().getName());
    	t1.finish();
    	assertEquals("Finished",t1.getState().getName());
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
    	
    	Exception e = assertThrows(RuntimeException.class, () -> t1.workedTime());
    	String expectedMessage = "Actual State Pending.";
    	assertEquals(expectedMessage, e.getMessage());
    			/*
    	boolean thrown = false;
    	try {
    		t1.workedTime();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    	
    	*/
    	
    	e = assertThrows(RuntimeException.class, () -> t1.togglePause());
    	expectedMessage = "Actual state is Pending, can't pause.";
    	assertEquals(expectedMessage, e.getMessage());
    	
    	/*
    	try {
    		t1.togglePause();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);
    	*/
    	
    	t1.start();
    	t1.finish();
    	
    	e = assertThrows(RuntimeException.class, () -> t1.togglePause());
    	expectedMessage = "Actual state is Finished, can't pause.";
    	assertEquals(expectedMessage, e.getMessage());

    	/*
    	try {
    		t1.togglePause();
    	}catch(Exception e) {
    		thrown = true;
    	}
    	assertTrue(thrown);

    	 */

    }
    	
}

