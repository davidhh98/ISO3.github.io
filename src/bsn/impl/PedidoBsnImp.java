package bsn.impl;

import javax.inject.Inject;

import bsn.PedidoBsn;
import dao.PedidoDAO;
import model.Pedido;

public class PedidoBsnImp implements PedidoBsn{
	
	@Inject
	private PedidoDAO pedidoDAO;
	
	public PedidoBsnImp() {
	}

	@Override
	public void registrarPedido(Pedido pedido) {
		pedidoDAO.almacenarPedido(pedido);
		
	}

	@Override
	public void eliminarPedido(Pedido pedido) {
		pedidoDAO.eliminarPedido(pedido);
		
	}

}
