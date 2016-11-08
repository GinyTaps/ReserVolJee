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
public class Reservation implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	private String matricule;
    private Date datereserv;
    private Date datedep;
    private String destination;
    private boolean validated;
    
    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name="iditiner")
    private Itineraire itineraire;
    
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Date getDatereserv() {
		return datereserv;
	}
	public void setDatereserv(Date datereserv) {
		this.datereserv = datereserv;
	}
	public Date getDatedep() {
		return datedep;
	}
	public void setDatedep(Date datedep) {
		this.datedep = datedep;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Itineraire getItineraire() {
		return itineraire;
	}
	public void setItineraire(Itineraire itineraire) {
		this.itineraire = itineraire;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(String matricule, Date datereserv, Date datedep, String destination, boolean validated) {
		super();
		this.matricule = matricule;
		this.datereserv = datereserv;
		this.datedep = datedep;
		this.destination = destination;
		this.validated = validated;
	}
    
    
	
}
