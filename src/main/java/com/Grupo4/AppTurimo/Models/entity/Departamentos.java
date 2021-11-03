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
@Document(collection="departamentos")
public class Departamentos implements Serializable {


	@Transient
	public static final String SEQUENCE_NAME="departamento_sequence";
	
	@Id
	Long id_dep;
	String nombre_dep;
	int id_pais_fk;
	
	
	
	public Departamentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamentos(String nombre_dep) {
		super();
		this.nombre_dep = nombre_dep;
	}
	
	public Long getId_dep() {
		return id_dep;
	}
	public void setId_dep(Long id_dep) {
		this.id_dep = id_dep;
	}
	public String getNombre_dep() {
		return nombre_dep;
	}
	public void setNombre_dep(String nombre_dep) {
		this.nombre_dep = nombre_dep;
	}
	public int getId_pais_fk() {
		return id_pais_fk;
	}
	public void setId_pais_fk(int id_pais_fk) {
		this.id_pais_fk = id_pais_fk;
	}
	
	
	private static final long serialVersionUID = 1L;
}
