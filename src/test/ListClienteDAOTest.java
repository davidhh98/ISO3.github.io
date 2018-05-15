package test;

import static org.junit.Assert.*;

import org.junit.Test;
import dao.impl.MySQLClienteDAO;

public class ListClienteDAOTest {
	
	private MySQLClienteDAO listC = new MySQLClienteDAO();
	
	@Test
	public void debeRegistraCliente() {
		String ced = "1234567890";
		String nom = "Andres";
		String apell = "Orozco";
		String fecha = "22/07/1997";
		String tel = "7777777";
		String email = "abcd@gmail.com";
		String cont = "12345";
		String resultado = listC.almacenarCliente(ced, nom, apell, fecha, tel, email, cont);
		assertEquals(cliente,resultado);	
	}

}
