package com.project.veterinaria.repository.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.veterinaria.dto.paciente.PacienteDTO;

@Repository
public class PacienteRepositoryImpl implements PacienteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public PacienteDTO getPacienteById(int id) {

		try {
			PacienteDTO paciente = jdbcTemplate.queryForObject("SELECT * FROM pacientes WHERE id=?",
					BeanPropertyRowMapper.newInstance(PacienteDTO.class), id);

			return paciente;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public PacienteDTO getAllPacientes() {
		try {
			PacienteDTO pacientes = jdbcTemplate.queryForObject("SELECT * FROM pacientes",
					BeanPropertyRowMapper.newInstance(PacienteDTO.class));

			return pacientes;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}

}
