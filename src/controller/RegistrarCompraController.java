package controller;

import bsn.CompraBsn;

public class RegistrarCompraController {
	@Inject
	private CompraBsn compraBsn;
	private int identificacion;
	private int id_cliente;
	private String fecha;
	private String direccion;
	private String solo_resrva;
	
	public String registrarCompra() {
		System.out.println("compra bsn tiene 1: "+ compraBsn);
		return "";
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSolo_resrva() {
		return solo_resrva;
	}
	public void setSolo_resrva(String solo_resrva) {
		this.solo_resrva = solo_resrva;
	}
	
}
