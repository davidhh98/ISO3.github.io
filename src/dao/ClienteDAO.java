package dao;

import model.Cliente;

public interface ClienteDAO {
	void almacenarCliente(Cliente cliente);
	
	void eliminarCliente(Cliente cliente);
}
