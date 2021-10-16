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
@Entity
@Table( name = "T_EMPLOYEE")
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

public User() {
	
}

@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + rolee + ", date="
			+ date + "]";
}

public User(int id, String firstName, String lastName, Role role, Date date) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.rolee = rolee;
	this.date = date;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Rolee getRole() {
	return rolee;
}

public void setRole(Rolee rolee) {
	this.rolee = rolee;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Temporal (TemporalType.DATE)
private Date date;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}