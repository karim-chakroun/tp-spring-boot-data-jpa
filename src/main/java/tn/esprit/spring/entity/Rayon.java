package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Rayon implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idRayon; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private String code;
	//@Column(name="EMPL_lastName")
	private String libelle;

}
