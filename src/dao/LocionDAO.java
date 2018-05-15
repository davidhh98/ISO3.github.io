package dao;

import model.Locion;

public interface LocionDAO {
	void almacenarLocion(Locion locion);
	
	void eliminarLocion(Locion locion);
}
