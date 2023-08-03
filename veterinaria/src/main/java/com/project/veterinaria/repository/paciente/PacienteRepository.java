package com.project.veterinaria.repository.paciente;

import com.project.veterinaria.dto.paciente.PacienteDTO;

public interface PacienteRepository {
	
	public abstract PacienteDTO getPacienteById(int id);
	
	public abstract PacienteDTO getAllPacientes();

	

}
