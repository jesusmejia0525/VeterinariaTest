package com.project.veterinaria.controller.propietarios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.veterinaria.dto.propietario.CitaDTO;

@RestController
public class PropietariosController {
	
ArrayList<CitaDTO> listaPropietarios=new ArrayList<>();
	
	@GetMapping("/propietario/{id}")
	public CitaDTO getPropietario( @PathVariable int id) {
	
		return listaPropietarios.get(id-1);
	
	}
	@GetMapping("/propietarios")
	public List<CitaDTO> listaPropietarios() {
		return listaPropietarios;
	
		
	}
	@PostMapping("/crearPropietario")
	public String createPropietario(@RequestBody CitaDTO propietario) {
	
		listaPropietarios.add(propietario);
		return "Exitoso propietario"; 
		
	}
	
	}
