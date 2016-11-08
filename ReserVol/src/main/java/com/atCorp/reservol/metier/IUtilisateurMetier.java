package com.atCorp.reservol.metier;

import java.util.List;

import com.atCorp.reservol.entities.Avion;
import com.atCorp.reservol.entities.Billet;
import com.atCorp.reservol.entities.Client;
import com.atCorp.reservol.entities.Compagnie;
import com.atCorp.reservol.entities.Equipe;
import com.atCorp.reservol.entities.Itineraire;
import com.atCorp.reservol.entities.Membre;
import com.atCorp.reservol.entities.Pays;
import com.atCorp.reservol.entities.Reservation;
import com.atCorp.reservol.entities.Tarif;
import com.atCorp.reservol.entities.Vol;

public interface IUtilisateurMetier extends IClientMetier {
	
	public Long ajouterVolDsItin(Vol vol, Long idItineraire);
	public Long ajouterAvionDsVol(Avion avi, Long idVol);
	public Long ajouterAvionDsComp(Avion avi, Long idCompagnie);
	public Long ajouterMemDsEquip(Membre mem, Long idEquipe);
	public void validerReservation (Reservation reserv, String mat);
	public List<Reservation> listReservation();
	public List<Reservation> reservationparMatricule(String matricule);
	public Reservation getReservation(Long idReservation);
	
	public List<Client> listClients();
	public Client getClient(Long idClient);
	public Long ajouterVol(Vol vol);
	public List<Vol> listVols();
	public Vol getVol(Long idVol);
	public void modifierVol(Vol vol);
	public void supprimerVol(Long idVol);
	
	public Long ajouterAvion(Avion avi);
	public List<Avion> listAvions();
	public Avion getAvion(Long idAvion);
	public void modifierAvion(Avion avi);
	public void supprimerAvion(Long idAvion);

	public Long ajouterItineraire (Itineraire itiner);
	public List<Itineraire> listItineraires();
	public Itineraire getItineraire(Long idItineraire);
	public void modifierItineraire(Itineraire itiner);
	public void supprimerItineraire(Long idItineraire);
	
	public Long ajouterPays(Pays pays);
	public List<Pays> listPays();
	public Pays getPays(Long idPays);
	public void modifierPays(Pays pays);
	public void supprimerPays(Long idPays);
	
	public Long ajouterTarifs(Tarif tar);
	public List<Tarif> listTarifs();
	public Tarif getTarif(Long idTarif);
	public void modifierTarif(Tarif tar);
	public void supprimerTarif(Long idTarif);
	
	public Long ajouterBillets(Billet bill);
	public List<Billet> listBillets();
	public Billet getBillet(Long idBillet);
	public void modifierBillet(Billet bill);
	public void supprimerBillet(Long idBillet);
	
	public Long ajouterCompagnie(Compagnie comp);
	public List<Compagnie> listCompagnies();
	public Compagnie getCompagnie(Long idCompagnie);
	public void modifierCompagnie(Compagnie comp);
	public void supprimerCompagnie(Long idCompagnie);
	
	public Long ajouterEquipe(Equipe equip);
	public List<Equipe> listEquipes();
	public Equipe getEquipe(Long idEquipe);
	public void modifierEquipe(Equipe equip);
	public void supprimerEquipe(Long idEquipe);
	
	public Long ajouterMembre(Membre mem);
	public List<Membre> listMembres();
	public Membre getMembre(Long idMembre);
	public void modifierMembre(Membre mem);
	public void supprimerMembre(Long idMembre);

}
