package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.ClienteDAO;
import dao.connection.MySQLConnection;
import model.Cliente;

public class MySQLClienteDAO implements ClienteDAO {
	
	private static final String select = "SELECT * FROM cliente";
	
	private static final String insert  = "INSERT INTO cliente(idcliente, nombre, apellido, telefono, correo, contraseña) VALUES (?,?,?,?,?,?)";
	
	private static final String delete  = "DELETE FROM cliente WHERE idcliente = ?";
	
	public MySQLClienteDAO() {
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
	public void almacenarCliente(Cliente cliente) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, cliente.getIdentificacion());
			pst.setString(6, cliente.getContraseña());
			pst.setString(3, cliente.getCorreo());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellido() );
			pst.setString(4, cliente.getTelefono());
			pst.setString(5, cliente.getCorreo());
			
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarCliente(Cliente cliente) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, cliente.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
