package bsn.impl;

import javax.inject.Inject;

import bsn.CantidadBsn;
import dao.CantidadDAO;
import model.Cantidad;

public class CantidadBsnImp implements CantidadBsn{
	
	@Inject
	private CantidadDAO cantidadDAO;
	
	public CantidadBsnImp() {
	}

	@Override
	public void registrarCantidad(Cantidad cantidad) {
		cantidadDAO.almacenarCantidad(cantidad);
	}

	@Override
	public void eliminarCantidad(Cantidad cantidad) {
		cantidadDAO.eliminarCantidad(cantidad);
	}

}
