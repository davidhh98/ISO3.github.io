package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dao.impl.MySQLAdministradorDAO;

public class ListAdministradorDAOTest {
	
	private MySQLAdministradorDAO listA = new MySQLAdministradorDAO();
	
	@Test
	public void debeRegistraAdmin() {
		String ced = "1234567890";
		String nom = "Andres";
		String apell = "Orozco";
		String fecha = "22/07/1997";
		String tel = "7777777";
		String email = "abcd@gmail.com";
		String cont = "12345";
		String resultado = listA.almacenarAdministrador(ced, nom, apell, fecha, tel, email, cont);
		assertEquals(admin,resultado);	
	}

}
