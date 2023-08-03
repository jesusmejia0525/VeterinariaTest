package com.project.veterinaria.controller.paciente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.veterinaria.dto.paciente.PacienteDTO;
import com.project.veterinaria.repository.paciente.PacienteRepository;

@RestController
public class PacientesController {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	ArrayList<PacienteDTO> listaPacientes=new ArrayList<>();
	
	@GetMapping("/paciente/{id}")
	public PacienteDTO getPaciente( @PathVariable int id) {
	
		return pacienteRepository.getPacienteById(id-1);
	
	}
	@GetMapping("/pacientes")
	public List<PacienteDTO> listaPacientes() {
		return listaPacientes;
	
		
	}
	@PostMapping("/crearPaciente")
	public String createPaciente(@RequestBody PacienteDTO paciente) {
	
		listaPacientes.add(paciente);
		return "Exitoso"; 
		
	}
	
	
}
