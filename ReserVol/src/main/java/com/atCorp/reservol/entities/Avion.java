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
public class Avion implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAvion;
	private String modele;
    private String nbreplace;
    
    @ManyToOne
    @JoinColumn(name="idcomp")
    private Compagnie compagnie;
    
    @OneToMany(mappedBy="avion")
    Collection<Vol> vols;
    
	public Long getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getNbreplace() {
		return nbreplace;
	}
	public void setNbreplace(String nbreplace) {
		this.nbreplace = nbreplace;
	}
	public Compagnie getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	public Collection<Vol> getVols() {
		return vols;
	}
	public void setVols(Collection<Vol> vols) {
		this.vols = vols;
	}
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avion(String modele, String nbreplace) {
		super();
		this.modele = modele;
		this.nbreplace = nbreplace;
	}
    
    
}
