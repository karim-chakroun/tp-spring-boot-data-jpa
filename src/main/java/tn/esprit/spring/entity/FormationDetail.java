package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="T_FORMATION_DETAIL")
public class FormationDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="FD_ID")
	private Long fdId;
	@Column(name="FD_TABLE_MATIERE")
	private String fdTableMatiere;
	@Column(name="FD_SUPPORT_PDF")
	private String fdSupportPDF;
	@OneToOne(mappedBy="formationDetail")
	private Formation formation;

}
