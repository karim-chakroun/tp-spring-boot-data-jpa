package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rayon implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idRayon; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private String code;
	//@Column(name="EMPL_lastName")
	private String libelle;
	@OneToMany(mappedBy = "rayon")
	private  List <Produit> produit;
	public int getIdRayon() {
		return idRayon;
	}
	public void setIdRayon(int idRayon) {
		this.idRayon = idRayon;
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
	public List<Produit> getProduit() {
		return produit;
	}
	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}
	public Rayon() {
		
	}
	public Rayon(int idRayon, String code, String libelle, List<Produit> produit) {
		
		this.idRayon = idRayon;
		this.code = code;
		this.libelle = libelle;
		this.produit = produit;
	}
	
	
	

}
