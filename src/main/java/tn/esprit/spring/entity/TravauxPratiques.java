package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T_TP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TravauxPratiques implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TP_ID")
	Long tpId;
	@Column(name="TP_SUJET")
	String tpSujet;
	@Column(name="TP_DUREE")
	Long tpDuree;
	@ManyToMany(mappedBy="formationTps", cascade = CascadeType.ALL)
	private Set<Formation> formations;

}
