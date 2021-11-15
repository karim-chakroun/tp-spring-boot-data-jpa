package tn.esprit.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entity.Founisseur;

public interface FournisseurRepository extends JpaRepository<Founisseur,Long> {

	
}
