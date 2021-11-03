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

import com.Grupo4.AppTurimo.Models.entity.Departamentos;
import com.Grupo4.AppTurimo.Models.services.SequenceGeneratorService;
import com.Grupo4.AppTurimo.Models.services.iDepartamenService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController()
@RequestMapping("/api")
public class DepartamentoRestController {

	
	@Autowired
	private iDepartamenService departamentoService;
	@Autowired
	private SequenceGeneratorService service;
	
	@GetMapping("/departamentos")
	public List<Departamentos> index(){
		
		return departamentoService.findAll();
     } 
	
	@GetMapping("/departamentos/{id}")
	public Optional<Departamentos> show(@PathVariable int id){
		
		return departamentoService.findById(id);
     }   
	
	@PostMapping("/departamentos")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamentos create(@RequestBody Departamentos departa) {
		 
	    departa.setId_dep(service.getSequenceNumber(Departamentos.SEQUENCE_NAME));	
		return departamentoService.save(departa);
	}
	
	@PutMapping("/departamentos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamentos update(@RequestBody Departamentos departa, @PathVariable int id ) {
		
		Optional<Departamentos> sitioActual = departamentoService.findById(id);
		Departamentos departValues = sitioActual.get();
		departValues.setNombre_dep(departa.getNombre_dep());
		
		return departamentoService.save(departValues);
	}
	
	@DeleteMapping("/departamentos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		 
		departamentoService.delete(id);
	}
}
