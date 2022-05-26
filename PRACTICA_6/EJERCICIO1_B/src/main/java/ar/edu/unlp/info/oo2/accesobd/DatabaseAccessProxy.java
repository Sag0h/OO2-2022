package ar.edu.unlp.info.oo2.accesobd;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {
	private DatabaseAccess database;
	private boolean logged;
	private String pass;
	
	private void configLogger() {
		Logger.getLogger("app.main").setUseParentHandlers(false);
		if(Logger.getLogger("app.main").getHandlers().length < 2 ) {
			Handler consoleHandler = new ConsoleHandler();
			consoleHandler.setFormatter(new ShoutingSimpleFormatter());
			Logger.getLogger("app.main").addHandler(consoleHandler);
			
			
			try {
				Handler fileHandler = new FileHandler("output_data/mylogs.json");
				fileHandler.setFormatter(new JSONFormatter());
				Logger.getLogger("app.main").addHandler(fileHandler);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// este if es porque JUnit ejecuta muchas veces mi constructor del AccessProxy 
		// y crea muchos handlers que no son necesarios
	}
	
	public DatabaseAccessProxy(String pass, DatabaseAccess database) {
		this.logged = false;
		this.pass = pass;
		this.database = database;
		configLogger();
	}
	
	public boolean login(String password) {
		if(password == pass) {
			logged = true;
		}else {
			Logger.getLogger("app.main").severe("Acceso invalido a la database.");
		}
		return logged;
	}

	public boolean isLogged() {
		if(!this.logged) {
			Logger.getLogger("app.main").severe("Acceso invalido a la database.");
		}
		return this.logged;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.isLogged()) {
			Logger.getLogger("app.main").info("Acceso valido para busqueda en database.");
			return database.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLogged()) {
			Logger.getLogger("app.main").warning("Acceso valido para insercion en database.");
			return database.insertNewRow(rowData);
		}
		return -1;
	}

}
