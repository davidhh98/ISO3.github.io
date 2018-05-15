package dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import dao.PersonaDAO;
import model.Persona;

@Alternative
public class ListPersonaDAO implements PersonaDAO {
	
	private final Map<String, Persona> personas= new HashMap<>();

	@Override
	public void almacenarPersona(Persona persona) {
		personas.put(persona.getIdentificacion(), persona);		

	}

}
