package com.Grupo4.AppTurimo.Models.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo4.AppTurimo.Models.dao.PaisDao;
import com.Grupo4.AppTurimo.Models.entity.Pais;

@Service
public class PaisServiceImpl implements iPaisService  {
	
	@Autowired
	private PaisDao paisDao;

	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return (List<Pais>)paisDao.findAll();
	}

	@Override
	public Optional<Pais> findById(int id) {
		// TODO Auto-generated method stub
		return paisDao.findById(id);
	}

	@Override
	public Pais save(Pais pais) {
		// TODO Auto-generated method stub
		return paisDao.save(pais);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		paisDao.deleteById(id);
	}

}
