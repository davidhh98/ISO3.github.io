package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import bsn.PersonaBsn;

@Named
@RequestScoped
public class RegistrarPersonaController {
	
	@Inject
	private PersonaBsn personaBsn;
	
	private String identificacion;
	
	private String nombres;
	
	private String apellidos;
	
	
	public String registrarPersona() {
		System.out.println("persona bsn tiene 1: "+ personaBsn);
		return "";
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	

}
