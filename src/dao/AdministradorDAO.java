package dao;

import model.Administrador;

public interface AdministradorDAO {
		void almacenarAdministrador(Administrador administrador);
		
		void eliminarAdministrador(Administrador administrador);
}
