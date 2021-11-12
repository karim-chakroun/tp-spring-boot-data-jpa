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
public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="EMPL_ID")
	private int idStock; // Clé primaire
	//@Column(name="EMPL_firstName",unique=true)
	private int qte;
	private int qteMin;
	private String libelleStock;
	
	@OneToMany(mappedBy = "stock")
	private  List <Produit> produit;

	

	public Stock(int qte, int qteMin, String libelleStock) {
		super();
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}
	
	
	
	
	
	
	
	
	

}
