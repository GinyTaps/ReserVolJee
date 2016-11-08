package com.atCorp.reservol.metier;

import java.util.List;

import com.atCorp.reservol.entities.Role;
import com.atCorp.reservol.entities.Utilisateur;

public interface IAdministrateurMetier extends IUtilisateurMetier {

	public void ajouterUtilisateur(Utilisateur util);
	public List<Utilisateur> listUtilisateurs();
	public void supprimerUtilisateur(Long idUtil);
	public void attribuerRole(Role ro, Long idUtil);
}
