package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Vol implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVol;
	private Date datedep;
    private Date datearriv;
    private String heuredecoll;
    private String heureatter;
    private String destination;
    
    @ManyToOne
    @JoinColumn(name="iditiner")
    private Itineraire itineraire;
    
    @ManyToOne
    @JoinColumn(name="idavion")
    private Avion avion;
    
	public Long getIdVol() {
		return idVol;
	}
	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}
	public Date getDatedep() {
		return datedep;
	}
	public void setDatedep(Date datedep) {
		this.datedep = datedep;
	}
	public Date getDatearriv() {
		return datearriv;
	}
	public void setDatearriv(Date datearriv) {
		this.datearriv = datearriv;
	}
	public String getHeuredecoll() {
		return heuredecoll;
	}
	public void setHeuredecoll(String heuredecoll) {
		this.heuredecoll = heuredecoll;
	}
	public String getHeureatter() {
		return heureatter;
	}
	public void setHeureatter(String heureatter) {
		this.heureatter = heureatter;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Itineraire getItineraire() {
		return itineraire;
	}
	public void setItineraire(Itineraire itineraire) {
		this.itineraire = itineraire;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vol(Date datedep, Date datearriv, String heuredecoll, String heureatter, String destination) {
		super();
		this.datedep = datedep;
		this.datearriv = datearriv;
		this.heuredecoll = heuredecoll;
		this.heureatter = heureatter;
		this.destination = destination;
	}
    
    
	
}
