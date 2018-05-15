package bsn.impl;

import javax.inject.Inject;

import bsn.LocionBsn;
import dao.LocionDAO;
import model.Locion;

public class LocionBsnImp implements LocionBsn {
	@Inject
	private LocionDAO locionDAO;
	
	
	public LocionBsnImp() {
	}


	@Override
	public void registrarLocion(Locion locion) {
		locionDAO.almacenarLocion(locion);
	}


	@Override
	public void elimintarLocion(Locion locion) {
		locionDAO.eliminarLocion(locion);
	}

}
