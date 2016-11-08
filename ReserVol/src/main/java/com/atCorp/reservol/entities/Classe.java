package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Classe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClasse;
	private String nomClasse;
 
    
    @OneToMany(mappedBy="classe")
    Collection<Tarif> tarifs;
    
    
	public Classe(String nomClasse) {
		super();
		this.nomClasse = nomClasse;
		
	}
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	
	public Collection<Tarif> getTarifs() {
		return tarifs;
	}
	public void setTarifs(Collection<Tarif> tarifs) {
		this.tarifs = tarifs;
	}
	
}
