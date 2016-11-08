package com.atCorp.reservol.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Billet implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idBillet;
	private String typebillet;
	
	@ManyToOne
	@JoinColumn(name="idreserv")
	private Reservation reservation;
	
    public Billet(String typebillet) {
		super();
		this.typebillet = typebillet;
	}
	public Billet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdBillet() {
		return idBillet;
	}
	public void setIdBillet(Long idBillet) {
		this.idBillet = idBillet;
	}
	public String getTypebillet() {
		return typebillet;
	}
	public void setTypebillet(String typebillet) {
		this.typebillet = typebillet;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
}
