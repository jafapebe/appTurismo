package com.Grupo4.AppTurimo.Models.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Grupo4.AppTurimo.Models.entity.Region;

public interface RegionDao extends MongoRepository<Region, Integer> {

}
