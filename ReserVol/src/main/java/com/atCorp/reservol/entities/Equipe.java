package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Equipe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEquipe;
	private String nbrepersonne;
    private String nomequipe;
    
    @ManyToOne
    @JoinColumn(name="idcomp")
    private Compagnie compagnie;
    
    @OneToMany(mappedBy="equipe")
    Collection<Membre> membres;
    
	public Long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNbrepersonne() {
		return nbrepersonne;
	}
	public void setNbrepersonne(String nbrepersonne) {
		this.nbrepersonne = nbrepersonne;
	}
	public String getNomequipe() {
		return nomequipe;
	}
	public void setNomequipe(String nomequipe) {
		this.nomequipe = nomequipe;
	}
	public Compagnie getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	public Collection<Membre> getMembres() {
		return membres;
	}
	public void setMembres(Collection<Membre> membres) {
		this.membres = membres;
	}
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(String nbrepersonne, String nomequipe) {
		super();
		this.nbrepersonne = nbrepersonne;
		this.nomequipe = nomequipe;
	}
    
    
	
}
