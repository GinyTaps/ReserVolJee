package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Compagnie implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCompagnie;
	private String nomCompagnie;
	
	@OneToMany(mappedBy="compagnie")
	Collection<Avion> avions;
	
	@OneToMany(mappedBy="compagnie")
	Collection<Equipe> equipes;
	
	public Long getIdCompagnie() {
		return idCompagnie;
	}
	public void setIdCompagnie(Long idCompagnie) {
		this.idCompagnie = idCompagnie;
	}
	public String getNomCompagnie() {
		return nomCompagnie;
	}
	public void setNomCompagnie(String nomCompagnie) {
		this.nomCompagnie = nomCompagnie;
	}
	public Collection<Avion> getAvions() {
		return avions;
	}
	public void setAvions(Collection<Avion> avions) {
		this.avions = avions;
	}
	public Collection<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}
	public Compagnie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compagnie(String nomCompagnie) {
		super();
		this.nomCompagnie = nomCompagnie;
	}
	
	
	
}
