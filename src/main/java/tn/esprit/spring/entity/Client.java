package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Client implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idClient; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private String nom;
	//@Column(name="EMPL_lastName")
	private String prenom;
	private Date dateNaissance;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	@Enumerated(EnumType.STRING)
	private Profession profession;

}
