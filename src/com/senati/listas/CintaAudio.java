package com.senati.listas;

public class CintaAudio extends Mediateca {
	String autor;
	String lugar;
	int duracion;
	public CintaAudio() {
		super();
	}
	public CintaAudio(int id,String titulo, float precio, String autor, String lugar, int duracion) {
		super(id, titulo, precio);
		this.autor = autor;
		this.lugar = lugar;
		this.duracion = duracion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "CintaAudio [autor=" + autor + ", lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo="
				+ titulo + ", precio=" + precio + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + duracion;
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CintaAudio other = (CintaAudio) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (duracion != other.duracion)
			return false;
		if (lugar == null) {
			if (other.lugar != null)
				return false;
		} else if (!lugar.equals(other.lugar))
			return false;
		return true;
	}
	
}