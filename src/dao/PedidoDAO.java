package dao;

import model.Pedido;

public interface PedidoDAO {
	void almacenarPedido(Pedido pedido);
	
	void eliminarPedido(Pedido pedido);
}
