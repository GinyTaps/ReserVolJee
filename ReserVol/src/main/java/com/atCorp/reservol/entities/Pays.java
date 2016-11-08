package com.atCorp.reservol.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pays implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPays;
	private String nompays;	
	
	public Long getIdPays() {
		return idPays;
	}
	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}
	public String getNompays() {
		return nompays;
	}
	public void setNompays(String nompays) {
		this.nompays = nompays;
	}
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pays(String nompays) {
		super();
		this.nompays = nompays;
	}
	
	
}
