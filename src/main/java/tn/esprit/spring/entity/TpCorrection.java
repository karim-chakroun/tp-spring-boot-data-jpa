package tn.esprit.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="T_TP_CORRECTION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TpCorrection {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="TC_ID")
	private Long tcId;

	@Column(name="TC_CORRECTION")
	private String tcCorrection;

	@ManyToOne
	TravauxPratiques travauxPratiques;

}
