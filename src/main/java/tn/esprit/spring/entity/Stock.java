package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idStock; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private int qte;
	private int qteMin;
	private String libelleStock;
	
	@OneToMany(mappedBy = "stock")
	private  List <Produit> produit;

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}

	public List<Produit> getProduit() {
		return produit;
	}

	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}

	public Stock() {
		
	}

	public Stock(int idStock, int qte, int qteMin, String libelleStock, List<Produit> produit) {
		
		this.idStock = idStock;
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
		this.produit = produit;
	}
	
	
	
	

}
