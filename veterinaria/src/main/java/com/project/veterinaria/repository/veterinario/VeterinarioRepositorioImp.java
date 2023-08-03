package com.project.veterinaria.repository.veterinario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.project.veterinaria.dto.veterinario.VeterinarioDTO;

public class VeterinarioRepositorioImp implements VeterinarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public VeterinarioDTO getVeterinarioById(int id) {
		 try {
			 VeterinarioDTO veterinario = jdbcTemplate.queryForObject("SELECT * FROM veterinarios WHERE id=?",
		          BeanPropertyRowMapper.newInstance(VeterinarioDTO.class), id);

		      return veterinario;
		    } catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		    }
	}

	

}
