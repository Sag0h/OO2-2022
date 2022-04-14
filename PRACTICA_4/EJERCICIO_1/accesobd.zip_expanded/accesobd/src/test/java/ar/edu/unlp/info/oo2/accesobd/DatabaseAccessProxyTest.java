package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
    DatabaseAccessProxy proxy;
    DatabaseAccess database;
    
    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseAccessProxy("1234", database);
    }
    
    @Test
    void testGetSearchResultsLogged() {
    	proxy.login("1234");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRowLogged() {
    	proxy.login("1234");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
    }
    
    
    @Test
    void testGetSearchResultsNotLogged() {
    	assertFalse(proxy.login("123")); // no loguea por contraseña invalida
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRowNotLogged() {
        assertEquals(-1, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=3"));
    }
}