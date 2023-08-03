package com.project.veterinaria.dto.citas;

import com.project.veterinaria.dto.paciente.PacienteDTO;
import com.project.veterinaria.dto.veterinario.VeterinarioDTO;

public class CitaDTO {
	
	private CitaDTO propietario;
	private PacienteDTO paciente;
	private VeterinarioDTO veterinario;
	private String fecha;
	private String Hora;
	public CitaDTO getPropietario() {
		return propietario;
	}
	public void setPropietario(CitaDTO propietario) {
		this.propietario = propietario;
	}
	public PacienteDTO getPaciente() {
		return paciente;
	}
	public void setPaciente(PacienteDTO paciente) {
		this.paciente = paciente;
	}
	public VeterinarioDTO getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(VeterinarioDTO veterinario) {
		this.veterinario = veterinario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	

	
}
