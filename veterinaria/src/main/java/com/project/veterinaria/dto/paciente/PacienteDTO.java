package com.project.veterinaria.dto.paciente;

import com.project.veterinaria.dto.veterinario.VeterinarioDTO;

public class PacienteDTO {
	
	private String nombre;
	private String tipo_paciente;
	private String fecha_nacimiento;
	private VeterinarioDTO veterinario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_paciente() {
		return tipo_paciente;
	}
	public void setTipo_paciente(String tipo_paciente) {
		this.tipo_paciente = tipo_paciente;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public VeterinarioDTO getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(VeterinarioDTO veterinario) {
		this.veterinario = veterinario;
	}
	
	
	
	

}
