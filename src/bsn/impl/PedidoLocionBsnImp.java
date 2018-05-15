package bsn.impl;

import javax.inject.Inject;

import bsn.PedidoLocionBsn;
import dao.PedidoLocionDAO;
import model.PedidoLocion;

public class PedidoLocionBsnImp implements PedidoLocionBsn{
	
	@Inject
	private PedidoLocionDAO pedidoLocionDAO;

	public PedidoLocionBsnImp() {
	}

	@Override
	public void registrarPedidoLocion(PedidoLocion pedidoLocion) {
		pedidoLocionDAO.almacenarPedidoLocion(pedidoLocion);
		
	}

	@Override
	public void eliminarPedidoLocion(PedidoLocion pedidoLocion) {
		pedidoLocionDAO.eliminarPedidoLocion(pedidoLocion);
		
	}
	
}
