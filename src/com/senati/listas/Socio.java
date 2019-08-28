package com.senati.listas;


public class Socio {
	int idsocio;
	String nombre;
	String apellido;
	String direccion;
	public Socio() {
		super();
	}
	public Socio(int idsocio, String nombre, String apellido, String direccion) {
		super();
		this.idsocio = idsocio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	public int getIdsocio() {
		return idsocio;
	}
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Socio [idsocio=" + idsocio + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + "]";
	}
	public String nombreCompleto() {
		return nombre + "" + apellido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + idsocio;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Socio other = (Socio) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (idsocio != other.idsocio)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}