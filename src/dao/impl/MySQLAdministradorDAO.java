package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.AdministradorDAO;
import dao.connection.MySQLConnection;
import model.Administrador;

public class MySQLAdministradorDAO implements AdministradorDAO {

	private static final String select = "SELECT * FROM administrador";
	
	private static final String insert  = "INSERT INTO administrador (idadministrador, contraseña, correo, nombre, apellido, telefono, fechaNacimiento, ) VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	private static final String delete  = "DELETE FROM administrador WHERE idadministrador = ?";
	
	public MySQLAdministradorDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  " + rs.getString(4) + "  " + rs.getString(5)+"  " + rs.getInt(6) + "  " + rs.getString(7));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void almacenarAdministrador(Administrador administrador) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, administrador.getIdentificacion());
			pst.setString(2, administrador.getContraseña());
			pst.setString(3, administrador.getCorreo());
			pst.setString(4, administrador.getNombre());
			pst.setString(5, administrador.getApellido() );
			pst.setInt(6, administrador.getTelefono());
			pst.setString(7, administrador.getFechaNacimiento());
			
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarAdministrador(Administrador administrador) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, administrador.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
