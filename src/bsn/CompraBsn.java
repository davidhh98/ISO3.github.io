package bsn;

import model.Compra;

public interface CompraBsn {
	void registrarCompra(Compra compra);
	
	void eliminarCompra(Compra compra);
}
