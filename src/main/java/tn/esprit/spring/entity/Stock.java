package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idStock; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private int qte;
	private int qteMin;
	private String libelleStock;

}
