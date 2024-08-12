package bibliooteca;

import java.util.List;

public class Biblioteca {
	private List<Libro> listaDeLibros;
	public Biblioteca() {
		
	}
	
	
	
	public Biblioteca(List<Libro> listaDeLibros) {
		super();
		this.listaDeLibros = listaDeLibros;
	}



	public Libro pedir(String nombreLibro) {
		Libro aDevolver = new Libro(nombreLibro, nombreLibro);
		
		if(this.listaDeLibros.contains(nombreLibro)) {
			int indice = this.listaDeLibros.indexOf(aDevolver);
			aDevolver = this.listaDeLibros.get(indice);
		}
		
		return aDevolver;
	}
	
	public void agregarLibro() {
		
	}

}
