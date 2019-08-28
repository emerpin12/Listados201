package com.senati.listas;

public class Prestamo {
	
	int idPrestamo;
	int idSocio;
	int idTitulo;
	int nrodias;
	float monto;
	public Prestamo() {
		super();
	}
	public Prestamo(int idPrestamo, int idSocio, int idTitulo, int nrodias, float monto) {
		super();
		this.idPrestamo = idPrestamo;
		this.idSocio = idSocio;
		this.idTitulo = idTitulo;
		this.nrodias = nrodias;
		this.monto = monto;
	}
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	public int getIdTitulo() {
		return idTitulo;
	}
	public void setIdTitulo(int idTitulo) {
		this.idTitulo = idTitulo;
	}
	public int getNrodias() {
		return nrodias;
	}
	public void setNrodias(int nrodias) {
		this.nrodias = nrodias;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Prestamo [idPrestamo=" + idPrestamo + ", idSocio=" + idSocio + ", idTitulo=" + idTitulo + ", nrodias="
				+ nrodias + ", monto=" + monto + "]";
	}
	
	
}
