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
@Document(collection="regiones")
public class Region  implements Serializable{

	
	@Transient
	public static final String SEQUENCE_NAME="regiones_sequence";
	
	@Id
	Long id_reg;
	String nombre_reg;
	int id_dep_fk;
	
		
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(String nombre_reg) {
		super();
		this.nombre_reg = nombre_reg;
	}
	
	public Long getId_reg() {
		return id_reg;
	}
	public void setId_reg(Long id_reg) {
		this.id_reg = id_reg;
	}
	public String getNombre_reg() {
		return nombre_reg;
	}
	public void setNombre_reg(String nombre_reg) {
		this.nombre_reg = nombre_reg;
	}
	public int getId_dep_fk() {
		return id_dep_fk;
	}
	public void setId_dep_fk(int id_dep_fk) {
		this.id_dep_fk = id_dep_fk;
	}
	
	private static final long serialVersionUID = 1L;
}
