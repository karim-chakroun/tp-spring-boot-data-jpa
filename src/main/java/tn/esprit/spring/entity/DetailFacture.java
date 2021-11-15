package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private long idDetailFacture; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private int qte;
	private float prixTotal;
	private int pourcentageRemise;
	private float montantRemise;
	
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Facture facture;
	
	
	
	
	

}
