package com.senati.listas;

import java.util.HashSet;
import java.util.Set;

public class ListarAudio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CintaAudio au01 = new CintaAudio(201,"Paint in Black", 15 ,"Rolling Stones", "Estados Unidos", 4 );
		CintaAudio au02 = new CintaAudio(202, "Holiday", 26 , "Madonna" , "Estados Unidos", 3);
		CintaAudio au03 = new CintaAudio(203, "Something", 23 , "The Beatles" , "Reino Unido", 3);
		CintaAudio au04 = new CintaAudio(204, "Y es que sucede asi", 16 , "Arena Hash" , "Peru", 3);
		
		Set <CintaAudio> audioMediateca = new HashSet<CintaAudio>();
		
		audioMediateca.add(au01);
		audioMediateca.add(au02);
		audioMediateca.add(au03);
		audioMediateca.add(au04);
		
		for (CintaAudio audio : audioMediateca) {
			System.out.println(audio.getId() + " , " + audio.getTitulo()+ " , " + audio.getPrecio()+ " , " + audio.getAutor() + " , " + audio.getLugar()+  " , " + audio.getDuracion());
		}
		
	}
}