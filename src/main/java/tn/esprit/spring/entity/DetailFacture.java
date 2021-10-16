package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
