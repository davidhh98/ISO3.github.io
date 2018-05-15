package dao;

import model.Cantidad;

public interface CantidadDAO {
	void almacenarCantidad(Cantidad cantidad);
	
	void eliminarCantidad(Cantidad cantidad);
}
