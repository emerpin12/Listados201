package com.senati.listas;

public class Libros extends Mediateca {
	String autor;
	int nropag;
	int nroisbn;
	public Libros() {
		super();
	}
	public Libros(int id, String titulo, float precio, String autor, int nropag, int nroisbn) {
		super( id,  titulo,  precio);
		this.autor = autor;
		this.nropag = nropag;
		this.nroisbn = nroisbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNropag() {
		return nropag;
	}
	public void setNropag(int nropag) {
		this.nropag = nropag;
	}
	public int getNroisbn() {
		return nroisbn;
	}
	public void setNroisbn(int nroisbn) {
		this.nroisbn = nroisbn;
	}
	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", nropag=" + nropag + ", nroisbn=" + nroisbn + ", id=" + id + ", titulo="
				+ titulo + ", precio=" + precio + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + nroisbn;
		result = prime * result + nropag;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libros other = (Libros) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (nroisbn != other.nroisbn)
			return false;
		if (nropag != other.nropag)
			return false;
		return true;
	}

}
