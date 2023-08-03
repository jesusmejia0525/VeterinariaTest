package com.project.veterinaria.controller.citas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.veterinaria.dto.citas.CitaDTO;

@RestController()
public class CitasController {
	

ArrayList<CitaDTO> listaCitas=new ArrayList<>();
	
	@GetMapping("/cita/{id}")
	public CitaDTO getCita( @PathVariable int id) {
	
		return listaCitas.get(id-1);
	
	}
	@GetMapping("/citas")
	public List<CitaDTO> listCitas() {
		return listaCitas;
	
		
	}
	@PostMapping("/crearCita")
	public String createCita(@RequestBody CitaDTO cita) {
	
		listaCitas.add(cita);
		return "Exitoso cita"; 
		
	}
	

}
