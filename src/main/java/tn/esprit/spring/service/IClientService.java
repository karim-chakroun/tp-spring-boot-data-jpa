package tn.esprit.spring.service;
import java.util.Date;
import java.util.List;
import tn.esprit.spring.entity.*;


public interface IClientService {

	List<Client> retrieveAllClients();

	Client addClient(Client c);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	
	List<Client> getClientsBetweenTwoDates (Date date1 , Date date2);
	
	List<Client> findClientsByCategorie(CategorieClient categorieClient);
	
	float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
	
}
