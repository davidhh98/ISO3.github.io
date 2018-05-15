package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import dao.CompraDAO;
import dao.connection.MySQLConnection;
import model.Compra;

public class MySQLCompraDAO implements CompraDAO {

	private static final String select = "SELECT * FROM compra";
	
	private static final String insert  = "INSERT INTO compra(idcompra, cliente_idcliente, fecha, direccion, solo_reserva) VALUES (?,?,?,?,?)";
	
	private static final String delete  = "DELETE FROM compra WHERE cliente_idcliente = ? and idcompra =  ?";
	
	public MySQLCompraDAO() {
		System.out.println("Se crea una instancia del DAO con MySQL");
		try {
			Connection conn = MySQLConnection.getConexion();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getString(3)+"  " + rs.getString(4) + "  " + rs.getString(5));
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void almacenarCompra(Compra compra) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setInt(1, compra.getIdentificacion());
			pst.setInt(2, compra.getId_cliente());
			pst.setString(3, compra.getFecha());
			pst.setString(4, compra.getDireccion());
			pst.setString(5, compra.getSolo_resrva());
			
			
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
		
	}

	@Override
	public void eliminarCompra(Compra compra) {
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(delete);
			pst.setInt(2, compra.getIdentificacion());
			pst.setInt(1, compra.getId_cliente());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}
	}

}
