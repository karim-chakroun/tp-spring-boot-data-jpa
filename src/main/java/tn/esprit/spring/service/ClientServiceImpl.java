package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

public class ClientServiceImpl implements ClientSerivce {
	
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		// TODO Auto-generated method stub
		
		return (List<Client>) clientRepository.findAll();
	}

	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		// TODO Auto-generated method stub
		Client c = clientRepository.findById(id).get();
		return c;
	}

}
