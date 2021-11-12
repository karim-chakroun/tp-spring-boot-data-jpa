package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;

import javax.management.relation.Role;
import javax.persistence.Column; import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table( name = "T_EMPLOYEE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
//@Column(name="EMPL_ID")
private int id; // Clé primaire
//@Column(name="EMPL_firstName",unique=true)
private String firstName;
//@Column(name="EMPL_lastName")
private String lastName;



@Enumerated(EnumType.STRING)
private Rolee rolee;

@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + rolee + ", date="
			+ date + "]";
}



@Temporal (TemporalType.DATE)
private Date date;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}