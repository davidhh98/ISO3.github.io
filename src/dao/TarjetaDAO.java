package dao;

import model.Tarjeta;

public interface TarjetaDAO {
	void almacenarTarjeta(Tarjeta tarjeta);
	
	void eliminarTarjeta(Tarjeta tarjeta);
}
