package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Facture implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idFacture; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private float montantRemise;
	private float montantFacture;
	private Date dateFacture;
	private boolean active;
}
