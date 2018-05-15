package bsn.impl;

import javax.inject.Inject;

import bsn.ClasificacionBsn;
import dao.ClasificacionDAO;
import model.Clasificacion;

public class ClasificacionBsnImp implements ClasificacionBsn {
	
	@Inject
	private ClasificacionDAO clasificacionDAO;
	
	public ClasificacionBsnImp() {
	}

	@Override
	public void registrarClasificacion(Clasificacion clasificacion) {
		// TODO Auto-generated method stub
	}

}
