package controller;

import javax.inject.Inject;

import bsn.AdministradorBsn;

public class RegistrarAdministradorController {
	
	@Inject
	private AdministradorBsn administradorBsn;
	
	private int identificacion;
	private String contraseña;
	private String correo;
	private String nombre;
	private String apellido;
	private int telefono;
	private String fechaNacimiento;
	
	public String registrarAdministrador() {
		System.out.println("Administrador bsn tiene 1: "+ administradorBsn);
		return"";
	}
	
	public AdministradorBsn getAdministradorBsn() {
		return administradorBsn;
	}
	public void setAdministradorBsn(AdministradorBsn administradorBsn) {
		this.administradorBsn = administradorBsn;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
