package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.enterprise.inject.Default;

import dao.PersonaDAO;
import dao.connection.MySQLConnection;
import model.Persona;

@Default
public class MySQLPersonaDAO implements PersonaDAO {
	

	private static final String select = "select * from persona";
	private static final String insert  = "INSERT INTO prueba1 (fasf, fdfasd, fsdfas) VALUES (?, ?, ?)";
	public MySQLPersonaDAO() {
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
	public void almacenarPersona(Persona persona) {
		
		try {
			Connection conn = MySQLConnection.getConexion();
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement(insert);
			pst.setString(1, persona.getIdentificacion());
			pst.setString(2, persona.getNombres());
			pst.setString(3, persona.getApellidos());
			pst.execute();
			System.out.println("Se registró exitosamente");
		}catch (Exception e){
			System.out.println("No se pudo realizar el registro"); 
		}

	}

}
