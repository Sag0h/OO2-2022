package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {
	private DatabaseAccess database;
	private boolean logged;
	private String pass;
	
	public DatabaseAccessProxy(String pass, DatabaseAccess database) {
		this.logged = false;
		this.pass = pass;
		this.database = database;
	}
	
	public boolean login(String password) {
		if(password == pass) {
			logged = true;
		}else {
			Logger.getLogger("app.main").log(Level.SEVERE, "Acceso invalido a la database.");
		}
		return logged;
	}

	public boolean isLogged() {
		if(!this.logged) {
			Logger.getLogger("app.main").log(Level.SEVERE, "Acceso invalido a la database.");
		}
		return this.logged;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged()) {
			Logger.getLogger("app.main").log(Level.INFO, "Acceso valido para busqueda en database.");
			return database.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLogged()) {
			Logger.getLogger("app.main").log(Level.WARNING, "Acceso valido para insercion en database.");
			return database.insertNewRow(rowData);
		}
		return -1;
	}

}
