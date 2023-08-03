package com.project.veterinaria.controller.veterinario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.veterinaria.dto.paciente.PacienteDTO;
import com.project.veterinaria.dto.veterinario.VeterinarioDTO;
import com.project.veterinaria.repository.veterinario.VeterinarioRepository;

@RestController
public class VeterinariosController {
	ArrayList<VeterinarioDTO> listaVeterinarios=new ArrayList<>();
	
	@Autowired
	VeterinarioRepository veterinarioRepositorio;
	
	@GetMapping("/veterinario/{id}")
	public VeterinarioDTO getVeterinario(@PathVariable int id) {
		
		return veterinarioRepositorio.getVeterinarioById(id-1);

	}

	@GetMapping("/veterinarios")
	public List<VeterinarioDTO> listaVeterinarios(){
		return listaVeterinarios;
	}
	
	@PostMapping("/crearVeterinario")
	public String createVeterinario(@RequestBody VeterinarioDTO veterinario) {
		listaVeterinarios.add(veterinario);
		
		return "Veterinario exitoso";
	}

	

}
