package com.project.veterinaria.dto.veterinario;

import java.io.Serializable;

public class VeterinarioDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String cedula_profesional;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getCedula_profesional() {
		return cedula_profesional;
	}
	public void setCedula_profesional(String cedula_profesional) {
		this.cedula_profesional = cedula_profesional;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
	
