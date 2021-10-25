package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class DetailFacture implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idDetailFacture; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private int qte;
	private float prixTotal;
	private int pourcentageRemise;
	private float montantRemise;
	
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Facture facture;
	public int getIdDetailFacture() {
		return idDetailFacture;
	}
	public void setIdDetailFacture(int idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}
	public int getPourcentageRemise() {
		return pourcentageRemise;
	}
	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public DetailFacture() {
		
	}
	public DetailFacture(int idDetailFacture, int qte, float prixTotal, int pourcentageRemise, float montantRemise,
			Produit produit, Facture facture) {
		
		this.idDetailFacture = idDetailFacture;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
		this.produit = produit;
		this.facture = facture;
	}
	
	
	
	

}
