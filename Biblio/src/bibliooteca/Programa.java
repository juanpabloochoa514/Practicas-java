package bibliooteca;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		Libro unLibro = new Libro("Dune", "ciencia ficcion");
		
		Libro otroLibro = new Libro("republica", "Filosofia");
		
		List<Libro> listaLibros= new ArrayList<Libro>();
		listaLibros.add(unLibro);
		listaLibros.add(otroLibro);
		
		Biblioteca nueva= new Biblioteca();
		
		Biblioteca otra= new Biblioteca(listaLibros);
		
		
		System.out.println(otra.pedir("Dune").toString());

	}

}
