package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
    private String prenomClient;
    private String adresseClient;
    private String telClient;
    private String logClient;
    private String passwdClient;
    
    @OneToMany(mappedBy="client")
    Collection<Reservation> reservations;
    
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public String getTelClient() {
		return telClient;
	}
	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}
	public String getLogClient() {
		return logClient;
	}
	public void setLogClient(String logClient) {
		this.logClient = logClient;
	}
	public String getPasswdClient() {
		return passwdClient;
	}
	public void setPasswdClient(String passwdClient) {
		this.passwdClient = passwdClient;
	}
	public Collection<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nomClient, String prenomClient, String adresseClient, String telClient, String logClient,
			String passwdClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresseClient = adresseClient;
		this.telClient = telClient;
		this.logClient = logClient;
		this.passwdClient = passwdClient;
	}
    
    
    
}
