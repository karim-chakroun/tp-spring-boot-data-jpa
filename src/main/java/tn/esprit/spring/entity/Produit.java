package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;

	 private String codeProduit;
	 private String libelleProduit;
	 private Float prixUnitaire;
	 
	 @ManyToOne
		private Stock stock;
		@ManyToOne
		private Rayon rayon;
		@OneToMany(mappedBy = "produit")
		private  List <DetailFacture> detailFactures;
		@OneToOne
		private DetailProduit detailProduit;
		@ManyToMany()
		private  Set <Founisseur> fournisseur;

}
