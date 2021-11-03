package com.Grupo4.AppTurimo.Models.services;

import java.util.List;
import java.util.Optional;

import com.Grupo4.AppTurimo.Models.entity.Departamentos;

public interface iDepartamenService {
	
	public List<Departamentos> findAll();
	public Optional<Departamentos> findById(int id);
	public Departamentos save(Departamentos depar);
	public void delete(int id);

}
