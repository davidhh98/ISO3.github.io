package bsn.impl;

import javax.inject.Inject;

import bsn.CompraBsn;
import dao.CompraDAO;
import model.Compra;

public class ComprasBsnImp implements CompraBsn {
	
	@Inject
	private CompraDAO compraDAO;
	
	public ComprasBsnImp() {
	
	}

	@Override
	public void registrarCompra(Compra compra) {
		compraDAO.almacenarCompra(compra);
		
	}

	@Override
	public void eliminarCompra(Compra compra) {
		compraDAO.eliminarCompra(compra);
	}

}
