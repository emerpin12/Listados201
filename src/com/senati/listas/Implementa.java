package com.senati.listas;

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libro1 = new Libros();
		libro1.id =  100;
		libro1.titulo = "C!";
		libro1.autor = "Grupo Eidos";
		libro1.nropag = 500;
		libro1.nroisbn = 1450;
		libro1.precio = 50f;
		
		System.out.println(libro1.toString());
		
		CintaVideo cintavideo1 = new CintaVideo();
		cintavideo1.id = 101;
		cintavideo1.director = "Quentin Tarantino";
		cintavideo1.actorprincipal = "Jhon Travolta";
		cintavideo1.actorsecundario = "Samuel L. Jackson";
		cintavideo1.titulo = "Pulp Fiction";
		cintavideo1.duracion = 240;
		cintavideo1.precio = 6;
		
		System.out.println(cintavideo1.toString());
		System.out.println("\n"+cintavideo1.Protagonistas());
		
		
		CintaAudio cintaudio1 = new CintaAudio();
		cintaudio1.id = 102;
		cintaudio1.autor = "Michael Jackson";
		cintaudio1.lugar = "Estados Unidos";
		cintaudio1.titulo = "Smooth Criminal";	
		cintaudio1.duracion = 5;
		cintaudio1.precio = 15;
		
		System.out.println(cintaudio1.toString());
		
		Socio socio1 = new Socio(401, "Jorge" , " Luque Chambi","Av.Alisos");
		System.out.println(socio1.nombreCompleto());
		System.out.println(socio1.toString());
		
		Prestamo prestamo1 = new Prestamo(501, 401, 200, 4, 20 );
		System.out.println(prestamo1.toString());
		
		
	}
}
