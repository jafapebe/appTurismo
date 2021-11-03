package com.Grupo4.AppTurimo.Models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo4.AppTurimo.Models.dao.RegionDao;
import com.Grupo4.AppTurimo.Models.entity.Region;

@Service
public class RegionServiceImpl implements iRegionService {
	
	@Autowired
	private RegionDao regionDao;


	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return (List<Region>)regionDao.findAll();
	}

	@Override
	public Optional<Region> findById(int id) {
		// TODO Auto-generated method stub
		return regionDao.findById(id);
	}

	@Override
	public Region save(Region region) {
		// TODO Auto-generated method stub
		return regionDao.save(region);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		regionDao.deleteById(id);
	}

}
