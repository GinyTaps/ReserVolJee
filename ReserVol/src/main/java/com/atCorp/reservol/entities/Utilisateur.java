package com.atCorp.reservol.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String logUtil;
    private String passwdUtil;
    private String nomUtil;
    private String prenomUtil;
    private String adresseUtil;
    private Date daterecrute;
    
    @OneToMany
    @JoinColumn(name="idutilis")
    Collection<Role> roles;
    
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getLogUtil() {
		return logUtil;
	}
	public void setLogUtil(String logUtil) {
		this.logUtil = logUtil;
	}
	public String getPasswdUtil() {
		return passwdUtil;
	}
	public void setPasswdUtil(String passwdUtil) {
		this.passwdUtil = passwdUtil;
	}
	public String getNomUtil() {
		return nomUtil;
	}
	public void setNomUtil(String nomUtil) {
		this.nomUtil = nomUtil;
	}
	public String getPrenomUtil() {
		return prenomUtil;
	}
	public void setPrenomUtil(String prenomUtil) {
		this.prenomUtil = prenomUtil;
	}
	public String getAdresseUtil() {
		return adresseUtil;
	}
	public void setAdresseUtil(String adresseUtil) {
		this.adresseUtil = adresseUtil;
	}
	public Date getDaterecrute() {
		return daterecrute;
	}
	public void setDaterecrute(Date daterecrute) {
		this.daterecrute = daterecrute;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String logUtil, String passwdUtil, String nomUtil, String prenomUtil, String adresseUtil,
			Date daterecrute) {
		super();
		this.logUtil = logUtil;
		this.passwdUtil = passwdUtil;
		this.nomUtil = nomUtil;
		this.prenomUtil = prenomUtil;
		this.adresseUtil = adresseUtil;
		this.daterecrute = daterecrute;
	}
    
    
	
}
