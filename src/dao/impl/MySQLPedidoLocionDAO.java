package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.PedidoLocionDAO;
import dao.connection.MySQLConnection;
import model.PedidoLocion;

public class MySQLPedidoLocionDAO implements PedidoLocionDAO {
	
	private static final String select = "SELECT * FROM pedido_has_locion";
	
	private static final String insert  = "INSERT INTO pedido_has_locion(pedido_idpedido, locion_idlocion, cantidad, precio) VALUES (?,?,?,?)";
	
	
	private static final String delete  = "INSERT INTO  pedido_has_locion WHERE pedido_idpedido = ? AND locion_idlocion = ? ";
	
	public MySQLPedidoLocionDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3)+ "  " + rs.getInt(4));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void almacenarPedidoLocion(PedidoLocion pedidoLocion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, pedidoLocion.getIdentificacion());
			pst.setInt(2, pedidoLocion.getLocion_identificacion());
			pst.setInt(3, pedidoLocion.getCantidad());
			pst.setInt(4, pedidoLocion.getPrecio());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarPedidoLocion(PedidoLocion pedidoLocion) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, pedidoLocion.getIdentificacion());
			pst.setInt(2, pedidoLocion.getLocion_identificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
