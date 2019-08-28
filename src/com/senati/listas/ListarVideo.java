package com.senati.listas;

import java.util.HashSet;
import java.util.Set;

public class ListarVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CintaVideo vid01 = new CintaVideo(301,"Alien", 7 ,"Ridley Scott", "Sigourney Weaver", "John Hurt", 210 );
		CintaVideo vid02 = new CintaVideo(302,"Star Wars", 5 ,"George Lucas", "Mark Hamill", "Harrison Ford", 240 );
		CintaVideo vid03 = new CintaVideo(303, "Avengers 4", 8 ,"Hermanos Russo", "Robert Downey Jr.", "Chris Evans", 310 );
		CintaVideo vid04 = new CintaVideo(304,"Asu Mare", 6 ,"Ricardo Maldonado", "Carlos Alcantara", "Emilia Drago", 180 );
		
		Set <CintaVideo> videoMediateca = new HashSet<CintaVideo>();
		
		videoMediateca.add(vid01);
		videoMediateca.add(vid02);
		videoMediateca.add(vid03);
		videoMediateca.add(vid04);
		
		for (CintaVideo video : videoMediateca) {
			System.out.println(video.getId() + " , " + video.getTitulo()+ " , " + video.getPrecio()+ " , " + video.getDirector() + " , " + video.getActorprincipal()+  " , " + video.getActorsecundario() + " , " + video.getDuracion());
		}
		
	}
}