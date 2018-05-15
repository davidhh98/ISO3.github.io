package bsn.impl;

import javax.inject.Inject;

import bsn.AdministradorBsn;
import dao.AdministradorDAO;
import model.Administrador;
import model.Persona;

public class AdministradorBsnImp implements AdministradorBsn {

	@Inject
	private AdministradorDAO administradorDAO;
	
	public AdministradorBsnImp() {
	}
	

	@Override
	public void registrarAdministrador(Administrador administrador) {
		administradorDAO.almacenarAdministrador(administrador);
		
	}

	@Override
	public void eliminarAdministrador(Administrador administrador) {
		administradorDAO.eliminarAdministrador(administrador);
	}

}
