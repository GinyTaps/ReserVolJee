package com.atCorp.reservol.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.atCorp.reservol.dao.IReserVolDAO;
import com.atCorp.reservol.entities.*;
@Transactional
public class ReserVolMetierImpl implements IAdministrateurMetier {
	public IReserVolDAO dao;

	public void setDao(IReserVolDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterVolDsItin(Vol vol, Long idItineraire) {
		// TODO Auto-generated method stub
		return dao.ajouterVolDsItin(vol, idItineraire);
	}

	@Override
	public Long ajouterAvionDsVol(Avion avi, Long idVol) {
		// TODO Auto-generated method stub
		return dao.ajouterAvionDsVol(avi, idVol);
	}

	@Override
	public Long ajouterAvionDsComp(Avion avi, Long idCompagnie) {
		// TODO Auto-generated method stub
		return dao.ajouterAvionDsComp(avi, idCompagnie);
	}

	@Override
	public Long ajouterMemDsEquip(Membre mem, Long idEquipe) {
		// TODO Auto-generated method stub
		return dao.ajouterMemDsEquip(mem, idEquipe);
	}

	@Override
	public void validerReservation(Reservation reserv, String mat) {
		dao.validerReservation(reserv, mat);
		
	}

	@Override
	public List<Reservation> listReservation() {
		// TODO Auto-generated method stub
		return dao.listReservation();
	}

	@Override
	public List<Reservation> reservationparMatricule(String matricule) {
		// TODO Auto-generated method stub
		return dao.reservationparMatricule(matricule);
	}

	@Override
	public Reservation getReservation(Long idReservation) {
		// TODO Auto-generated method stub
		return dao.getReservation(idReservation);
	}

	@Override
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return dao.listClients();
	}

	@Override
	public Client getClient(Long idClient) {
		// TODO Auto-generated method stub
		return dao.getClient(idClient);
	}

	@Override
	public Long ajouterVol(Vol vol) {
		// TODO Auto-generated method stub
		return dao.ajouterVol(vol);
	}

	@Override
	public List<Vol> listVols() {
		// TODO Auto-generated method stub
		return dao.listVols();
	}

	@Override
	public Vol getVol(Long idVol) {
		// TODO Auto-generated method stub
		return dao.getVol(idVol);
	}

	@Override
	public void modifierVol(Vol vol) {
		dao.modifierVol(vol);
		
	}

	@Override
	public void supprimerVol(Long idVol) {
		dao.supprimerVol(idVol);
		
	}

	@Override
	public Long ajouterAvion(Avion avi) {
		// TODO Auto-generated method stub
		return dao.ajouterAvion(avi);
	}

	@Override
	public List<Avion> listAvions() {
		// TODO Auto-generated method stub
		return dao.listAvions();
	}

	@Override
	public Avion getAvion(Long idAvion) {
		// TODO Auto-generated method stub
		return dao.getAvion(idAvion);
	}

	@Override
	public void modifierAvion(Avion avi) {
		dao.modifierAvion(avi);
		
	}

	@Override
	public void supprimerAvion(Long idAvion) {
		dao.supprimerAvion(idAvion);
		
	}

	@Override
	public Long ajouterItineraire(Itineraire itiner) {
		// TODO Auto-generated method stub
		return dao.ajouterItineraire(itiner);
	}

	@Override
	public List<Itineraire> listItineraires() {
		// TODO Auto-generated method stub
		return dao.listItineraires();
	}

	@Override
	public Itineraire getItineraire(Long idItineraire) {
		// TODO Auto-generated method stub
		return dao.getItineraire(idItineraire);
	}

	@Override
	public void modifierItineraire(Itineraire itiner) {
		dao.modifierItineraire(itiner);
		
	}

	@Override
	public void supprimerItineraire(Long idItineraire) {
		dao.supprimerItineraire(idItineraire);
		
	}

	@Override
	public Long ajouterPays(Pays pays) {
		// TODO Auto-generated method stub
		return dao.ajouterPays(pays);
	}

	@Override
	public List<Pays> listPays() {
		// TODO Auto-generated method stub
		return dao.listPays();
	}

	@Override
	public Pays getPays(Long idPays) {
		// TODO Auto-generated method stub
		return dao.getPays(idPays);
	}

	@Override
	public void modifierPays(Pays pays) {
		dao.modifierPays(pays);
		
	}

	@Override
	public void supprimerPays(Long idPays) {
		dao.supprimerPays(idPays);
		
	}

	@Override
	public Long ajouterTarifs(Tarif tar) {
		// TODO Auto-generated method stub
		return dao.ajouterTarifs(tar);
	}

	@Override
	public List<Tarif> listTarifs() {
		// TODO Auto-generated method stub
		return dao.listTarifs();
	}

	@Override
	public Tarif getTarif(Long idTarif) {
		// TODO Auto-generated method stub
		return dao.getTarif(idTarif);
	}

	@Override
	public void modifierTarif(Tarif tar) {
		dao.modifierTarif(tar);
		
	}

	@Override
	public void supprimerTarif(Long idTarif) {
		dao.supprimerTarif(idTarif);
		
	}

	@Override
	public Long ajouterBillets(Billet bill) {
		// TODO Auto-generated method stub
		return dao.ajouterBillets(bill);
	}

	@Override
	public List<Billet> listBillets() {
		// TODO Auto-generated method stub
		return dao.listBillets();
	}

	@Override
	public Billet getBillet(Long idBillet) {
		// TODO Auto-generated method stub
		return dao.getBillet(idBillet);
	}

	@Override
	public void modifierBillet(Billet bill) {
		dao.modifierBillet(bill);
		
	}

	@Override
	public void supprimerBillet(Long idBillet) {
		dao.supprimerBillet(idBillet);
		
	}

	@Override
	public Long ajouterCompagnie(Compagnie comp) {
		// TODO Auto-generated method stub
		return dao.ajouterCompagnie(comp);
	}

	@Override
	public List<Compagnie> listCompagnies() {
		// TODO Auto-generated method stub
		return dao.listCompagnies();
	}

	@Override
	public Compagnie getCompagnie(Long idCompagnie) {
		// TODO Auto-generated method stub
		return dao.getCompagnie(idCompagnie);
	}

	@Override
	public void modifierCompagnie(Compagnie comp) {
		dao.modifierCompagnie(comp);
		
	}

	@Override
	public void supprimerCompagnie(Long idCompagnie) {
		dao.supprimerCompagnie(idCompagnie);
		
	}

	@Override
	public Long ajouterEquipe(Equipe equip) {
		// TODO Auto-generated method stub
		return dao.ajouterEquipe(equip);
	}

	@Override
	public List<Equipe> listEquipes() {
		// TODO Auto-generated method stub
		return dao.listEquipes();
	}

	@Override
	public Equipe getEquipe(Long idEquipe) {
		// TODO Auto-generated method stub
		return dao.getEquipe(idEquipe);
	}

	@Override
	public void modifierEquipe(Equipe equip) {
		dao.modifierEquipe(equip);
		
	}

	@Override
	public void supprimerEquipe(Long idEquipe) {
		dao.supprimerEquipe(idEquipe);
		
	}

	@Override
	public Long ajouterMembre(Membre mem) {
		// TODO Auto-generated method stub
		return dao.ajouterMembre(mem);
	}

	@Override
	public List<Membre> listMembres() {
		// TODO Auto-generated method stub
		return dao.listMembres();
	}

	@Override
	public Membre getMembre(Long idMembre) {
		// TODO Auto-generated method stub
		return dao.getMembre(idMembre);
	}

	@Override
	public void modifierMembre(Membre mem) {
		dao.modifierMembre(mem);
		
	}

	@Override
	public void supprimerMembre(Long idMembre) {
		dao.supprimerMembre(idMembre);
		
	}

	@Override
	public Long ajouterReservation(Reservation reserv, Long idClient) {
		// TODO Auto-generated method stub
		return dao.ajouterReservation(reserv, idClient);
	}

	@Override
	public void modifierReservation(Reservation reser) {
		dao.modifierReservation(reser);
		
	}

	@Override
	public void supprimerReservation(Long idReservation) {
		dao.supprimerReservation(idReservation);
		
	}

	@Override
	public Long ajouterClient(Client cli) {
		// TODO Auto-generated method stub
		return dao.ajouterClient(cli);
	}

	@Override
	public void modifierClient(Client cli) {
		dao.modifierClient(cli);
		
	}

	@Override
	public void supprimerClient(Long idClient) {
		dao.supprimerClient(idClient);
		
	}

	@Override
	public void ajouterUtilisateur(Utilisateur util) {
		dao.ajouterUtilisateur(util);
		
	}
	@Override
	public List<Utilisateur> listUtilisateurs() {
		// TODO Auto-generated method stub
		return dao.listUtilisateurs();
	}

	@Override
	public void supprimerUtilisateur(Long idUtil) {
		dao.supprimerUtilisateur(idUtil);
		
	}

	@Override
	public void attribuerRole(Role ro, Long idUtil) {
		dao.attribuerRole(ro, idUtil);
		
	}

	

}
