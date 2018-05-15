package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.LocionClasificacionDAO;
import dao.connection.MySQLConnection;
import model.LocionClasificacion;

public class MySQLLocionClasificacion implements LocionClasificacionDAO {
	private static final String select = "SELECT * FROM locion_has_clasificacion";
	
	private static final String insert  = "INSERT INTO locion_has_clasificacion(locion_idlocion, categoria_idcategoria) VALUES (?,?)";
	
	private static final String delete  = "DELETE FROM `locion_has_clasificacion` WHERE locion_idlocion = ? and categoria_idcategoria = ?";
	
	public MySQLLocionClasificacion() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void almacenarLocionClasificacion(LocionClasificacion locionClasificacion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, locionClasificacion.getIdentificacion());
			pst.setInt(2, locionClasificacion.getCategoria_identificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

	@Override
	public void eliminarLocionClasificacion(LocionClasificacion locionClasificacion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, locionClasificacion.getIdentificacion());
			pst.setInt(2, locionClasificacion.getCategoria_identificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
		
	}

}
