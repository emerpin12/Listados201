package com.senati.listas;

import java.util.HashSet;
import java.util.Set;

public class ListarSocios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio so01 = new Socio(1, "Jorge "," Luque Chambi ", " Independencia ");
		Socio so02 = new Socio(2, " Monica "," Salas Chanduvi ", " Carbayllo ");
		Socio so03 = new Socio(3, " Brigith "," Huicho Pinto ", " La Victoria");
		Socio so04 = new Socio(4, " Stefany "," Valderrama Torrejon ", " uacho ");
		Socio so05 = new Socio(5, " rithany "," Paredes de Vidal ", " Payet ");
		Socio so06 = new Socio(6, " Nelly "," Sandoval Leyva ", " Puente Piedra ");
		Socio so07 = new Socio(7, " Isidora "," Chihuan Martinez ", " La Molina ");
		Socio so08 = new Socio(8, " Tristona "," Pardo Chiroque ", " Barrios Altos ");
		Socio so09 = new Socio(9, " Pericles "," Dominguez Chambi ", " Cercado ");
		Socio so10 = new Socio(10, " Ronaldo "," Amasifen Chambi ", " Huancayo ");
		

		Set <Socio> socioMediateca = new HashSet<Socio>();
		
		socioMediateca.add(so01);
		socioMediateca.add(so02);
		socioMediateca.add(so03);
		socioMediateca.add(so04);
		socioMediateca.add(so05);
		socioMediateca.add(so06);
		socioMediateca.add(so07);
		socioMediateca.add(so08);
		socioMediateca.add(so09);
		socioMediateca.add(so10);
		
		for (Socio socio : socioMediateca) {
			System.out.println(socio.getIdsocio() + "" + socio.getApellido() + "" + socio.getNombre());
	}

   }
}