package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.PedidoDAO;
import dao.connection.MySQLConnection;
import model.Pedido;

public class MySQLPedidoDAO implements PedidoDAO {
	
	private static final String select = "SELECT * FROM pedido";
	
	private static final String insert  = "INSERT INTO pedido(idpedido, distribuidor, fecha) VALUES (?,?,?)";
	
	private static final String delete  = "DELETE FROM `pedido` WHERE idpedido = ? ";
	
	public MySQLPedidoDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void almacenarPedido(Pedido pedido) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, pedido.getIdentificacion());
			pst.setString(2, pedido.getDistribuidor());
			pst.setString(3, pedido.getFecha());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarPedido(Pedido pedido) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, pedido.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
