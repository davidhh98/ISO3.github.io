package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.CantidadDAO;
import dao.connection.MySQLConnection;
import model.Cantidad;

public class MySQLCantidadDAO implements CantidadDAO{


	private static final String select = "SELECT * FROM cantidad";
	
	private static final String insert  = "INSERT INTO cantidad(existenciacol, tamaño, locion_idlocion) VALUES (?,?,?)";
	
	private static final String delete  = "DELETE FROM cantidad WHERE locion_idlocion = ?";
	
	public MySQLCantidadDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void almacenarCantidad(Cantidad cantidad) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, cantidad.getExistencia());
			pst.setInt(2, cantidad.getTamaño());
			pst.setInt(3, cantidad.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

	@Override
	public void eliminarCantidad(Cantidad cantidad) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, cantidad.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
