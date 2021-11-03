package com.Grupo4.AppTurimo.Models.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="paises")
public class Pais implements Serializable {
	
	@Transient
	public static final String SEQUENCE_NAME="pais_sequence";
	
	@Id
	Long id_pais;
	String nombre_pais;
	
	
	public Pais() {
		
	}


	public Pais(String nombre_pais) {
		super();
		this.nombre_pais = nombre_pais;
	}


	public Long getId_pais() {
		return id_pais;
	}


	public void setId_pais(Long id_pais) {
		this.id_pais = id_pais;
	}


	public String getNombre_pais() {
		return nombre_pais;
	}


	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}


	private static final long serialVersionUID = 1L;

}
