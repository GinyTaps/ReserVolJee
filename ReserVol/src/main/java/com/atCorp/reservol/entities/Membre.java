package com.atCorp.reservol.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Membre implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMembre;
	private String nomM;
    private String prenomM;
    private String adresseM;
    private String fonctionM;
    
    @ManyToOne
    @JoinColumn(name="idequipe")
    private Equipe equipe;
    
	public Long getIdMembre() {
		return idMembre;
	}
	public void setIdMembre(Long idMembre) {
		this.idMembre = idMembre;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getPrenomM() {
		return prenomM;
	}
	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}
	public String getAdresseM() {
		return adresseM;
	}
	public void setAdresseM(String adresseM) {
		this.adresseM = adresseM;
	}
	public String getFonctionM() {
		return fonctionM;
	}
	public void setFonctionM(String fonctionM) {
		this.fonctionM = fonctionM;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Membre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membre(String nomM, String prenomM, String adresseM, String fonctionM) {
		super();
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.adresseM = adresseM;
		this.fonctionM = fonctionM;
	}
    
    
	
}
