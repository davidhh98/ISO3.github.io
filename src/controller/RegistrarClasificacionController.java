package controller;

import javax.inject.Inject;

import bsn.ClasificacionBsn;

public class RegistrarClasificacionController {
	
	@Inject
	private ClasificacionBsn clasificacionBsn;
	
	private int identificacion;
	
	private String nombre;
	
	private String descripcion;
	
	public String registrarClasificacion() {
		System.out.println("Clasificacion bsn tiene 1: "+ clasificacionBsn);
		return "";
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
