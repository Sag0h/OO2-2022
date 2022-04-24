package ar.edu.unlp.info.oo2.ejercicio3_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PostApp {
	private List<Post> posts;

	public PostApp() {
		this.posts = new ArrayList<Post>();
	}
	
	public PostApp(List<Post> posts) {
		this.posts = posts;
	}
	
	public void addPost(Post p) {
		this.posts.add(p);
	}
	
	private List<Post> filtrarPostsDeUsuario(Usuario user){
	    List<Post> postsOtrosUsuarios = new ArrayList<Post>();
	    for (Post post : this.posts) {
	        if (!post.getUsuario().equals(user)) {
	            postsOtrosUsuarios.add(post);
	        }
	    }
	    return postsOtrosUsuarios;
	}
	
	private void ordenarPostsPorFecha(List<Post> postsOtrosUsuarios){
		   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
		       int masNuevo = i;
		       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
		           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
		     postsOtrosUsuarios.get(masNuevo).getFecha())) {
		              masNuevo = j;
		           }    
		       }
		      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
		      postsOtrosUsuarios.set(masNuevo, unPost);    
		   }
	}
	
	private List<Post> getUltimosPosts(int cantidad, List<Post> postsOtrosUsuarios) {
		List<Post> ultimosPosts = new ArrayList<Post>();
	    int index = 0;
	    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	    while (postIterator.hasNext() &&  index < cantidad) {
	        ultimosPosts.add(postIterator.next());
	    }
	    return ultimosPosts;
	}
	
/**
* Retorna los últimos N posts que no pertenecen al usuario user
*/
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		List<Post> postsOtrosUsuarios = this.filtrarPostsDeUsuario(user);

		this.ordenarPostsPorFecha(postsOtrosUsuarios); 
	  
		return this.getUltimosPosts(cantidad, postsOtrosUsuarios);
	    
	}

}
