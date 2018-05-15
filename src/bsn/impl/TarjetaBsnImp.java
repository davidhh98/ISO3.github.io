package bsn.impl;

import javax.inject.Inject;

import bsn.TarjetaBsn;
import dao.TarjetaDAO;
import model.Tarjeta;

public class TarjetaBsnImp implements TarjetaBsn {

	@Inject
	private TarjetaDAO tarjetaDAO;
	
	public TarjetaBsnImp() {
	}

	@Override
	public void registrarTarjeta(Tarjeta tarjeta) {
		tarjetaDAO.almacenarTarjeta(tarjeta);
		
	}

	@Override
	public void eliminarTarjeta(Tarjeta tarjeta) {
		tarjetaDAO.eliminarTarjeta(tarjeta);
		
	}

}
