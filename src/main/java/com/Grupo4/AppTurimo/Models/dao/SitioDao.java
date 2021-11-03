package com.Grupo4.AppTurimo.Models.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Grupo4.AppTurimo.Models.entity.Sitio;

public interface SitioDao extends MongoRepository<Sitio, String> {

}
