package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;

public abstract class Content {
    protected String name;

    public Content(String name){
        this.name = name.toLowerCase();
    }

    protected boolean isInOrEqual(String s){
        return this.getName().contains(s);
    }

    public abstract List<Song> search(String s);


    public String getName(){
        return this.name;
    }
}
