package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.TarjetaDAO;
import dao.connection.MySQLConnection;
import model.Tarjeta;

public class MySQLTarjetaDAO implements TarjetaDAO{
	
	private static final String select = "SELECT * FROM tarjeta";
	
	private static final String insert  = "INSERT INTO tarjeta(idtarjeta, saldo, cliente_idcliente) VALUES (?,?,?)";
	
	private static final String delete  = "DELETE FROM `pedido` WHERE idpedido = ? ";
	
	public MySQLPedidoDAO() {
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
	public void almacenarTarjeta(Tarjeta tarjeta) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, tarjeta.getIdentificacion());
			pst.setInt(2, tarjeta.getSaldo());
			pst.setInt(3, tarjeta.getCliente_identificacion());
		
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

	@Override
	public void eliminarTarjeta(Tarjeta tarjeta) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(1, tarjeta.getIdentificacion());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

}
