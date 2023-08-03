package com.project.veterinaria.repository.veterinario;

import com.project.veterinaria.dto.veterinario.VeterinarioDTO;

public interface VeterinarioRepository {
	
	public abstract VeterinarioDTO getVeterinarioById(int id);

}
