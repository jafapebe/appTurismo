package com.Grupo4.AppTurimo.Models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Grupo4.AppTurimo.Models.entity.Departamentos;
import com.Grupo4.AppTurimo.Models.dao.DepartamentoDao;

@Service
public class DepartamenServiceImpl implements iDepartamenService  {

	@Autowired
	private DepartamentoDao departameDao;
	
	@Override
	public List<Departamentos> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamentos>)departameDao.findAll();
	}

	@Override
	public Optional<Departamentos> findById(int id) {
		// TODO Auto-generated method stub
		return departameDao.findById(id);
	}

	@Override
	public Departamentos save(Departamentos depar) {
		// TODO Auto-generated method stub
		return departameDao.save(depar);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		departameDao.deleteById(id);
	}

}
