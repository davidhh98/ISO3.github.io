package dao;

import model.LocionClasificacion;

public interface LocionClasificacionDAO {
	void almacenarLocionClasificacion(LocionClasificacion locionClasificacion);
	
	void eliminarLocionClasificacion(LocionClasificacion locionClasificacion);
}
