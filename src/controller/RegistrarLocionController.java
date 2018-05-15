package controller;

import javax.inject.Inject;

import bsn.LocionBsn;

public class RegistrarLocionController {
	@Inject
	private LocionBsn locionBsn;
	 private int identificacion;
	 private int precio;
	 private String sexo;
	 private String imagen;
	 private String fabricante;
	 private String nombre;
	 
	 public String registrarLocion() {
		 System.out.println("locion bsn tiene 1: "+ locionBsn);
		 return "";
	 }
	 
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
