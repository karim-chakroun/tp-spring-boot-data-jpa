package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
