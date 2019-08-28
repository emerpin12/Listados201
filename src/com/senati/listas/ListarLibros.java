package com.senati.listas;

import java.util.HashSet;
import java.util.Set;

public class ListarLibros extends Mediateca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros li01 = new Libros(101,"La ciudad y los perros", 5 ,"Gabriel Garcia Marquez", 345, 1230 );
		Libros li02 = new Libros(102, "Tradiciones Peruanas", 6 , "Ricardo Palma" , 210, 1001);
		Libros li03 = new Libros(103, "Los rios profundos", 4 , "Jose Maria Arguedas" , 178, 1500);
		Libros li04 = new Libros(104, "Los gallinazos sin plumas", 6 , "Julio Ramon Ribeyro" , 145, 2011);
		
		Set <Libros> librosMediateca = new HashSet<Libros>();
		
		librosMediateca.add(li01);
		librosMediateca.add(li02);
		librosMediateca.add(li03);
		librosMediateca.add(li04);
		
		for (Libros libros : librosMediateca) {
			System.out.println(libros.getId() + " , " + libros.getTitulo()+ " , " + libros.getPrecio()+ " , " + libros.getAutor() + " , " + libros.getNropag()+ " , " + libros.getNroisbn());
		}
		
	}
}