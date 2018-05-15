package dao;

import model.PedidoLocion;

public interface PedidoLocionDAO {
	void almacenarPedidoLocion(PedidoLocion pedidoLocion);
	
	void eliminarPedidoLocion(PedidoLocion pedidoLocion);
}
