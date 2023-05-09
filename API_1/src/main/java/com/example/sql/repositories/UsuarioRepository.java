package com.example.sql.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import com.example.sql.models.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
	public abstract ArrayList<UsuarioModel> findByNombre(String nombre);
	public abstract ArrayList<UsuarioModel> findBymail(String mail);

}
