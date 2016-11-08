package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Itineraire implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idItineraire;
	private String horaire;
    private String duree;
    
    @OneToMany(mappedBy="itineraire")
    Collection<Reservation> reservations;
    
    @OneToMany(mappedBy="itineraire")
    Collection<Vol> vols;
    
    @ManyToMany
    Collection<Pays> pays;
    
    @ManyToMany
    Collection<Compagnie> compagnie;
    
    @ManyToMany
    Collection<Tarif> tarif;
    
    
	public Long getIdItineraire() {
		return idItineraire;
	}
	public void setIdItineraire(Long idItineraire) {
		this.idItineraire = idItineraire;
	}
	public String getHoraire() {
		return horaire;
	}
	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public Collection<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	public Collection<Vol> getVols() {
		return vols;
	}
	public void setVols(Collection<Vol> vols) {
		this.vols = vols;
	}
	public Itineraire(String horaire, String duree) {
		super();
		this.horaire = horaire;
		this.duree = duree;
	}
	
	public Itineraire() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
}
