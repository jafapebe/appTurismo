package com.Grupo4.AppTurimo.Models.services;


import java.util.List;
import java.util.Optional;

import com.Grupo4.AppTurimo.Models.entity.Pais;

public interface iPaisService {
	
	public List<Pais> findAll();
	public Optional<Pais> findById(int id);
	public Pais save(Pais pais);
	public void delete(int id);
}
