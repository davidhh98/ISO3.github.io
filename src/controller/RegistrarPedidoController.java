package controller;

import javax.inject.Inject;

import bsn.PedidoBsn;

public class RegistrarPedidoController {
	@Inject
	private PedidoBsn pedidoBsn;
	
	private int identificacion;
	
	private String distribuidor;
	
	private String fecha;
	
	public String registrarPedido() {
		System.out.println("pedidoBsn tiene 1: "+ pedidoBsn);
		return "";
	}
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
