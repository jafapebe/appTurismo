package com.Grupo4.AppTurimo.Models.services;

import java.util.List;
import java.util.Optional;

import com.Grupo4.AppTurimo.Models.entity.Region;

public interface  iRegionService {
	
	public List<Region> findAll();
	public Optional<Region> findById(int id);
	public Region save(Region region);
	public void delete(int id);


}
