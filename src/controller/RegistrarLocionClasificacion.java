package controller;

import javax.inject.Inject;

import bsn.LocionClasificacionBsn;

public class RegistrarLocionClasificacion {
	@Inject
	private LocionClasificacionBsn locionClasificacionBsn;
	private int identificacion;
	private int categoria_identificacion;
	
	public String registrarLocionClasificacion() {
		System.out.println("locionClasificacionBsn tiene 1: "+ locionClasificacionBsn);
		return "";
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getCategoria_identificacion() {
		return categoria_identificacion;
	}
	public void setCategoria_identificacion(int categoria_identificacion) {
		this.categoria_identificacion = categoria_identificacion;
	}
}
