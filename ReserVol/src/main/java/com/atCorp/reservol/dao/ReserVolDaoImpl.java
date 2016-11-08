package com.atCorp.reservol.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.commons.collections.functors.IdentityPredicate;

import com.atCorp.reservol.entities.*;



public class ReserVolDaoImpl implements IReserVolDAO {
	public EntityManager em;

	@Override
	public Long ajouterItineraire(Itineraire itiner) {
		em.persist(itiner);// méthode jpa pour ajouter un itinéraire
		return itiner.getIdItineraire();
	}

	@Override
	public List<Itineraire> listItineraires() {
		javax.persistence.Query req=em.createQuery("select itiner from Itineraire itiner");// Lister les itinéraires
		return req.getResultList();
	}

	@Override
	public Itineraire getItineraire(Long idItineraire) {
		return em.find(Itineraire.class, idItineraire);// consulter un itinéraire précis
	}

	@Override
	public void modifierItineraire(Itineraire itiner) {
		em.merge(itiner);// modifier un itinéraire
		
	}

	@Override
	public void supprimerItineraire(Long idItineraire) {
		Itineraire itiner=em.find(Itineraire.class, idItineraire);//afficher/trouver l'itinéraire
		em.remove(itiner);// supprimer un itinéraire
		
	}

	@Override
	public Long ajouterPays(Pays pays) {
		em.persist(pays);// TODO Auto-generated method stub
		return pays.getIdPays();
	}

	@Override
	public List<Pays> listPays() {
		javax.persistence.Query req=em.createQuery("select pays from Pays pays");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Pays getPays(Long idPays) {
		return em.find(Pays.class, idPays);
	}

	@Override
	public void modifierPays(Pays pays) {
		em.merge(pays);
		
	}

	@Override
	public void supprimerPays(Long idPays) {
		Pays pays= em.find(Pays.class, idPays);// TODO Auto-generated method stub
		em.remove(pays);
		
	}

	@Override
	public Long ajouterTarifs(Tarif tar) {
		em.persist(tar);// TODO Auto-generated method stub
		return tar.getIdTarif();
	}

	@Override
	public List<Tarif> listTarifs() {
		javax.persistence.Query req= em.createQuery("select tar from Tarif tar");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Tarif getTarif(Long idTarif) {
		return em.find(Tarif.class, idTarif);
	}

	@Override
	public void modifierTarif(Tarif tar) {
		em.merge(tar);
		
	}

	@Override
	public void supprimerTarif(Long idTarif) {
		Tarif tar= em.find(Tarif.class, idTarif);// TODO Auto-generated method stub
		em.remove(tar);
		
	}

	@Override
	public Long ajouterBillets(Billet bill) {
		em.persist(bill);// TODO Auto-generated method stub
		return bill.getIdBillet();
	}

	@Override
	public List<Billet> listBillets() {
		javax.persistence.Query req=em.createQuery("select bill from Billet bill");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Billet getBillet(Long idBillet) {
		return em.find(Billet.class, idBillet);
	}

	@Override
	public void modifierBillet(Billet bill) {
		em.merge(bill);
		
	}

	@Override
	public void supprimerBillet(Long idBillet) {
		Billet bill= em.find(Billet.class, idBillet);// TODO Auto-generated method stub
		em.remove(bill);
		
	}

	@Override
	public Long ajouterCompagnie(Compagnie comp) {
		em.persist(comp);// TODO Auto-generated method stub
		return comp.getIdCompagnie();
	}

	@Override
	public List<Compagnie> listCompagnies() {
		javax.persistence.Query req=em.createQuery("select comp from Compagnie comp");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Compagnie getCompagnie(Long idCompagnie) {
		return em.find(Compagnie.class, idCompagnie);
	}

	@Override
	public void modifierCompagnie(Compagnie comp) {
		em.merge(comp);
		
	}

	@Override
	public void supprimerCompagnie(Long idCompagnie) {
		Compagnie comp= em.find(Compagnie.class, idCompagnie);// TODO Auto-generated method stub
		em.remove(comp);
	}

	@Override
	public Long ajouterEquipe(Equipe equip) {
		em.persist(equip);// TODO Auto-generated method stub
		return equip.getIdEquipe();
	}

	@Override
	public List<Equipe> listEquipes() {
		javax.persistence.Query req= em.createQuery("select equip from Equipe equip");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Equipe getEquipe(Long idEquipe) {
		return em.find(Equipe.class, idEquipe);
	}

	@Override
	public void modifierEquipe(Equipe equip) {
		em.merge(equip);
		
	}

	@Override
	public void supprimerEquipe(Long idEquipe) {
		Equipe equip= em.find(Equipe.class, idEquipe);// TODO Auto-generated method stub
		em.remove(equip);
		
	}

	@Override
	public Long ajouterMembre(Membre mem) {
		em.persist(mem);// TODO Auto-generated method stub
		return mem.getIdMembre();
	}

	@Override
	public List<Membre> listMembres() {
		javax.persistence.Query req= em.createQuery("select mem from Membre mem");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Membre getMembre(Long idMembre) {
		return em.find(Membre.class, idMembre);
	}

	@Override
	public void modifierMembre(Membre mem) {
		em.merge(mem);
		
	}

	@Override
	public void supprimerMembre(Long idMembre) {
		Membre mem= em.find(Membre.class, idMembre);// TODO Auto-generated method stub
		em.remove(mem);
		
	}

	@Override
	public Long ajouterReservation(Reservation reserv, Long idClient) {
		Client cli =getClient(idClient);
		reserv.setClient(cli);
		em.persist(reserv);
		return reserv.getIdReservation();
	}

	@Override
	public List<Reservation> listReservation() {
		javax.persistence.Query req =em.createQuery("select reser from Reservation reser");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public List<Reservation> reservationparMatricule(String matricule) {
		javax.persistence.Query req =em.createQuery("select reser from Reservation reser where reser.client.matricule=:x");// TODO Auto-generated method stub
		req.setParameter("x", matricule);
		return req.getResultList();
	}

	@Override
	public Reservation getReservation(Long idReservation) {
		return em.find(Reservation.class, idReservation);
	}

	@Override
	public void modifierReservation(Reservation reser) {
		em.merge(reser);
		
	}

	@Override
	public void supprimerReservation(Long idReservation) {
		Reservation rser= em.find(Reservation.class, idReservation);// TODO Auto-generated method stub
		em.remove(rser);
		
	}

	@Override
	public Long ajouterVol(Vol vol) {
		em.persist(vol);// TODO Auto-generated method stub
		return vol.getIdVol();
	}

	@Override
	public List<Vol> listVols() {
		javax.persistence.Query req=em.createQuery("select vol from Vol vol");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Vol getVol(Long idVol) {
		return em.find(Vol.class, idVol);
	}

	@Override
	public void modifierVol(Vol vol) {
		em.merge(vol);
		
	}

	@Override
	public void supprimerVol(Long idVol) {
		Vol vol= em.find(Vol.class, idVol);// TODO Auto-generated method stub
		em.remove(vol);
		
	}

	@Override
	public Long ajouterAvion(Avion avi) {
		em.persist(avi);// TODO Auto-generated method stub
		return avi.getIdAvion();
	}

	@Override
	public List<Avion> listAvions() {
		javax.persistence.Query req=em.createQuery("select avi from Avion avi");// TODO Auto-generated method stub
		return req.getResultList();
	}

	@Override
	public Avion getAvion(Long idAvion) {
		return em.find(Avion.class, idAvion);
	}

	@Override
	public void modifierAvion(Avion avi) {
		em.merge(avi);
		
	}

	@Override
	public void supprimerAvion(Long idAvion) {
		Avion avi= em.find(Avion.class, idAvion);// TODO Auto-generated method stub
		em.remove(avi);
		
	}

	@Override
	public Long ajouterClient(Client cli) {
		em.persist(cli);// TODO Auto-generated method stub
		return cli.getIdClient();
	}

	@Override
	public List<Client> listClients() {
		javax.persistence.Query req=em.createQuery("select cli from Client cli");// Lister les itinéraires
		return req.getResultList();
	}

	@Override
	public Client getClient(Long idClient) {
		return em.find(Client.class, idClient);
	}

	@Override
	public void modifierClient(Client cli) {
		em.merge(cli);
		
	}

	@Override
	public void supprimerClient(Long idClient) {
		Client cli= em.find(Client.class, idClient);// TODO Auto-generated method stub
		em.remove(cli);
		
	}

	@Override
	public Long ajouterVolDsItin(Vol vol, Long idItineraire) {
		Itineraire itiner=getItineraire(idItineraire);
		vol.setItineraire(itiner);
		em.persist(vol);// TODO Auto-generated method stub
		return vol.getIdVol() ;
	}


	@Override
	public Long ajouterAvionDsVol(Avion avi, Long idVol) {
		Vol vol=getVol(idVol);
		avi.setVols(listVols());
		em.persist(avi);// TODO Auto-generated method stub
		return avi.getIdAvion();
	}

	@Override
	public Long ajouterAvionDsComp(Avion avi, Long idCompagnie) {
		Compagnie comp=getCompagnie(idCompagnie);
		avi.setCompagnie(comp);
		em.persist(avi);// TODO Auto-generated method stub
		return avi.getIdAvion();
	}

	@Override
	public Long ajouterMemDsEquip(Membre mem, Long idEquipe) {
		Equipe equip=getEquipe(idEquipe);
		mem.setEquipe(equip);
		em.persist(mem);// TODO Auto-generated method stub
		return mem.getIdMembre();
	}

	@Override
	public void ajouterUtilisateur(Utilisateur util) {
		em.persist(util);
		
	}
	
	@Override
	public List<Utilisateur> listUtilisateurs() {
		javax.persistence.Query req=em.createQuery("select util from Utilisateur util");// Lister les utilisateurs
		return req.getResultList();
	}
	
	@Override
	public void supprimerUtilisateur(Long idUtil) {
		Utilisateur util= em.find(Utilisateur.class, idUtil);// TODO Auto-generated method stub
		em.remove(util);
		
	}

	@Override
	public void attribuerRole(Role ro, Long idUtil) {
		Utilisateur util= em.find(Utilisateur.class, idUtil);
		util.getRoles().add(ro);
		em.persist(ro);
		
	}

	@Override
	public void validerReservation(Reservation reserv, String mat) {
		reservationparMatricule(mat);
		
		if(reserv.getDatereserv().getDay()<7)
		{
			reserv.setValidated(true);
			em.persist(reserv);
		}
		else 
			em.remove(reserv);
		
	}

	@Override
	public String matriculealea(Client cli) {
		String symb, mat = null;
		symb = cli.getNomClient().substring(1).concat(cli.getPrenomClient().substring(1));
		Calendar annee = Calendar.getInstance();
		int an = annee.get(Calendar.YEAR);
		symb = symb.concat(String.valueOf(an));
		if(listReservation().isEmpty()){
			symb = symb.concat("0");
		}
		else{
			mat = (listReservation().get(listReservation().size())).getMatricule();
			int cp = Integer.parseInt(mat.substring(6, 7))+1;
			symb = symb.concat(String.valueOf(cp));
		}
		
	    return symb;
	  }


}
