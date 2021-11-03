package com.Grupo4.AppTurimo.Models.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sitios")
public class Sitio implements Serializable {

		
	@Id
	Long id_sit;
	String descripcion_sit;
	String imagen_sit;
	String nombre_sit;
	int id_trg_fk;
	
	
	
	public Sitio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sitio(String nombre_sit) {
		super();
		this.nombre_sit = nombre_sit;
	}
	
	public Long getId_sit() {
		return id_sit;
	}
	public void setId_sit(Long id_sit) {
		this.id_sit = id_sit;
	}
	public String getDescripcion_sit() {
		return descripcion_sit;
	}
	public void setDescripcion_sit(String descripcion_sit) {
		this.descripcion_sit = descripcion_sit;
	}
	public String getImagen_sit() {
		return imagen_sit;
	}
	public void setImagen_sit(String imagen_sit) {
		this.imagen_sit = imagen_sit;
	}
	public String getNombre_sit() {
		return nombre_sit;
	}
	public void setNombre_sit(String nombre_sit) {
		this.nombre_sit = nombre_sit;
	}
	public int getId_trg_fk() {
		return id_trg_fk;
	}
	public void setId_trg_fk(int id_trg_fk) {
		this.id_trg_fk = id_trg_fk;
	}
	
	private static final long serialVersionUID = 1L;
}
