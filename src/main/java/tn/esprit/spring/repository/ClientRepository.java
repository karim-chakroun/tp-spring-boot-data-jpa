package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.User;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {
	
	@Query("SELECT * FROM T_Client c WHERE BETWEEN 01-01-1995 AND 31-12-1995 ")
	List<Client> retrieveClientsByDate();
	
	
	List<Client> findByNom(String nom);
	

}
