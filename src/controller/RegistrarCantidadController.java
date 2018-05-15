package controller;

import javax.inject.Inject;

import bsn.CantidadBsn;

public class RegistrarCantidadController {
	
	@Inject
	private CantidadBsn cantidadBsn;
	
	private int identificacion;
	private int tamaño;
	private int existencia;
	
	public String regsitrarCantidad() {
		System.out.println("Cantidad bsn tiene 1: "+ cantidadBsn);
		return "";
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
}
