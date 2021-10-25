package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@ManyToOne
	private Client client;
	@OneToMany(mappedBy = "facture")
	private  List <DetailFacture> detailFactures;
}
