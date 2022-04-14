package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

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
		}
		return logged;
	}

	public boolean isLogged() {
		return this.logged;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged()) {
			return database.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLogged()) {
			return database.insertNewRow(rowData);
		}
		return -1;
	}

}
