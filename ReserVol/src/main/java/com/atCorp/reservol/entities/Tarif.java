package com.atCorp.reservol.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Tarif implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTarif;
	private String cout;
	
	@ManyToOne
	@JoinColumn(name="idclasse")
	private Classe classe;
	
	public Long getIdTarif() {
		return idTarif;
	}
	public void setIdTarif(Long idTarif) {
		this.idTarif = idTarif;
	}
	public String getCout() {
		return cout;
	}
	public void setCout(String cout) {
		this.cout = cout;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Tarif() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarif(String cout) {
		super();
		this.cout = cout;
	}
	
	
	
}
