package bsn.impl;

import javax.inject.Inject;

import bsn.ClienteBsn;
import dao.ClienteDAO;
import model.Cliente;

public class ClienteBsnImp implements ClienteBsn {
	
	@Inject
	private ClienteDAO clienteDAO;
	
	
	public ClienteBsnImp() {
	}

	@Override
	public void registrarCliente(Cliente cliente) {
		clienteDAO.almacenarCliente(cliente);;
		
	}

	@Override
	public void eliminarCliente(Cliente cliente) {
		clienteDAO.eliminarCliente(cliente);
	}

}
