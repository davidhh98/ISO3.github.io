package bsn.impl;

import javax.inject.Inject;

import bsn.PersonaBsn;
import dao.PersonaDAO;
import model.Persona;

public class PersonaBsnImpl implements PersonaBsn {
	
	@Inject
	private PersonaDAO personaDAO;
	
	public PersonaBsnImpl() {
	}

	@Override
	public void registrarPersona(Persona persona) {
		
	}

}
