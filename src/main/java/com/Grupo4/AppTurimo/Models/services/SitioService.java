package com.Grupo4.AppTurimo.Models.services;

import java.util.Collection;
import java.util.Optional;

import com.Grupo4.AppTurimo.Models.entity.Sitio;

public interface SitioService {
	
	public Collection<Sitio> findAll();
	public Optional<Sitio> findById(String id);
	public Sitio save(Sitio region);
	public void delete(String id);

}
