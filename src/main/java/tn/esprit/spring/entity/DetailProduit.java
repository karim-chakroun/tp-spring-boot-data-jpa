package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class DetailProduit implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idDetailProduit; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private Date dateCreation;
	private Date dateDerniereModification;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieproduit;
	@OneToOne
	private Produit produit;
	public int getIdDetailProduit() {
		return idDetailProduit;
	}
	public void setIdDetailProduit(int idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}
	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}
	public CategorieProduit getCategorieproduit() {
		return categorieproduit;
	}
	public void setCategorieproduit(CategorieProduit categorieproduit) {
		this.categorieproduit = categorieproduit;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public DetailProduit() {
		
	}
	public DetailProduit(int idDetailProduit, Date dateCreation, Date dateDerniereModification,
			CategorieProduit categorieproduit, Produit produit) {
		
		this.idDetailProduit = idDetailProduit;
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieproduit = categorieproduit;
		this.produit = produit;
	}
	
	
}
