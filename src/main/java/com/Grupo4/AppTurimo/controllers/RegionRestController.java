package com.Grupo4.AppTurimo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Grupo4.AppTurimo.Models.entity.Region;
import com.Grupo4.AppTurimo.Models.services.SequenceGeneratorService;
import com.Grupo4.AppTurimo.Models.services.iRegionService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController()
@RequestMapping("/api")
public class RegionRestController {
	
	@Autowired
	private iRegionService regionService;
	@Autowired
	private SequenceGeneratorService service;
	
	@GetMapping("/regiones")
	public List<Region> index(){
		
		return regionService.findAll();
     } 
	
	@GetMapping("/regiones/{id}")
	public Optional<Region> show(@PathVariable int id){
		
		return regionService.findById(id);
     }   
	
	@PostMapping("/regiones")
	@ResponseStatus(HttpStatus.CREATED)
	public Region create(@RequestBody Region region) {
		 
	    region.setId_reg(service.getSequenceNumber(Region.SEQUENCE_NAME));	
		return regionService.save(region);
	}
	
	@PutMapping("/regiones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Region update(@RequestBody Region region, @PathVariable int id ) {
		
		Optional<Region> sitioActual = regionService.findById(id);
		Region regionValues = sitioActual.get();
		regionValues.setNombre_reg(region.getNombre_reg());
		
		return regionService.save(regionValues);
	}
	
	@DeleteMapping("/regiones/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		 
		regionService.delete(id);
	}

}
