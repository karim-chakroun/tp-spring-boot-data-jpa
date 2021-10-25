package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Founisseur implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idFournisseur; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private String code;
	//@Column(name="EMPL_lastName")
	private String libelle;
	
	
	public Founisseur() {
		
	}
	public Founisseur(int idFournisseur, String code, String libelle) {
		
		this.idFournisseur = idFournisseur;
		this.code = code;
		this.libelle = libelle;
	}
	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
