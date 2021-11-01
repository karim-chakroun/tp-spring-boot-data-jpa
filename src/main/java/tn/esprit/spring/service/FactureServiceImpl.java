package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;

public class FactureServiceImpl implements FactureService {
	
	FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelFacture(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		Facture f = factureRepository.findById(id).get();
		return f;
	}

}
