package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rayon implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idRayon; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private String code;
	//@Column(name="EMPL_lastName")
	private String libelle;
	@OneToMany(mappedBy = "rayon")
	private  List <Produit> produit;
	
	
	
	

}
