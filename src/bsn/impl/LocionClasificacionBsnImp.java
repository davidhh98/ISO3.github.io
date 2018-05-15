package bsn.impl;

import javax.inject.Inject;

import bsn.LocionClasificacionBsn;
import dao.LocionClasificacionDAO;
import model.LocionClasificacion;

public class LocionClasificacionBsnImp implements LocionClasificacionBsn {
	
	@Inject
	private LocionClasificacionDAO locionClasificacionDAO;
	
	public LocionClasificacionBsnImp() {
	}

	@Override
	public void registrarLocionClasificacion(LocionClasificacion locionClasificacion) {
		locionClasificacionDAO.almacenarLocionClasificacion(locionClasificacion);
		
	}

	@Override
	public void eliminarLocionClasificacion(LocionClasificacion locionClasificacion) {
		locionClasificacionDAO.eliminarLocionClasificacion(locionClasificacion);
		
	}

}
