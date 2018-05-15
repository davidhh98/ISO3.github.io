package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.LocionDAO;
import dao.connection.MySQLConnection;
import model.Locion;

public class MySQLLocionDAO implements LocionDAO{
	
	private static final String select = "SELECT * FROM locion";
	
	private static final String insert  = "INSERT INTO `locion`(idlocion, nombre, precio, sexo, imagen, fabricante) VALUES (?,?,?,?,?,?)";
	
	private static final String delete  = "DELETE FROM locion WHERE idlocion = ? ";
	
	public MySQLLocionDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3)+"  " + rs.getString(4) + "  " + rs.getString(5));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void almacenarLocion(Locion locion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, locion.getIdentificacion());
			pst.setString(2, locion.getNombre());
			pst.setInt(3, locion.getPrecio());
			pst.setString(4, locion.getSexo());
			pst.setString(5, locion.getImagen());
			pst.setString(6, locion.getFabricante());
			
			
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarLocion(Locion locion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, locion.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
