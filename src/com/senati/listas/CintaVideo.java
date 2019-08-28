package com.senati.listas;


public class CintaVideo extends Mediateca{
	String director;
	String actorprincipal;
	String actorsecundario;
	int duracion;
	public CintaVideo() {
		super();
	}
	public CintaVideo(int id, String titulo, float precio, String director, String actorprincipal, String actorsecundario, int duracion) {
		super(id, titulo, precio);
		this.director = director;
		this.actorprincipal = actorprincipal;
		this.actorsecundario = actorsecundario;
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActorprincipal() {
		return actorprincipal;
	}
	public void setActorprincipal(String actorprincipal) {
		this.actorprincipal = actorprincipal;
	}
	public String getActorsecundario() {
		return actorsecundario;
	}
	public void setActorsecundario(String actorsecundario) {
		this.actorsecundario = actorsecundario;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "CintaVideo [director=" + director + ", actorprincipal=" + actorprincipal + ", actorsecundario="
				+ actorsecundario + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo + ", precio="
				+ precio + "]";
	}
public String Protagonistas() {
	return director + " , " + actorprincipal + " , " + actorsecundario;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((actorprincipal == null) ? 0 : actorprincipal.hashCode());
	result = prime * result + ((actorsecundario == null) ? 0 : actorsecundario.hashCode());
	result = prime * result + ((director == null) ? 0 : director.hashCode());
	result = prime * result + duracion;
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
	CintaVideo other = (CintaVideo) obj;
	if (actorprincipal == null) {
		if (other.actorprincipal != null)
			return false;
	} else if (!actorprincipal.equals(other.actorprincipal))
		return false;
	if (actorsecundario == null) {
		if (other.actorsecundario != null)
			return false;
	} else if (!actorsecundario.equals(other.actorsecundario))
		return false;
	if (director == null) {
		if (other.director != null)
			return false;
	} else if (!director.equals(other.director))
		return false;
	if (duracion != other.duracion)
		return false;
	return true;
}

}
