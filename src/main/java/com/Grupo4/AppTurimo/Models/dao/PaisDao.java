package com.Grupo4.AppTurimo.Models.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Grupo4.AppTurimo.Models.entity.Pais;

public interface PaisDao extends MongoRepository<Pais, Integer> {

}
