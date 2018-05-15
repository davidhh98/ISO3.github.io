package dao;

import model.Compra;

public interface CompraDAO {
	void almacenarCompra(Compra compra);
	
	void eliminarCompra(Compra compra);
}
