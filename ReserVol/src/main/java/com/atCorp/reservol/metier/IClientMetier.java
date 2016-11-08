package com.atCorp.reservol.metier;

import java.util.List;

import com.atCorp.reservol.entities.Client;
import com.atCorp.reservol.entities.Reservation;

public interface IClientMetier {
	
	public Long ajouterReservation(Reservation reserv, Long idClient);
	public List<Reservation> listReservation();
	public void modifierReservation(Reservation reser);
	public void supprimerReservation(Long idReservation);
	public Long ajouterClient(Client cli);
	public void modifierClient(Client cli);
	public void supprimerClient(Long idClient);
	
	
	
	

}
