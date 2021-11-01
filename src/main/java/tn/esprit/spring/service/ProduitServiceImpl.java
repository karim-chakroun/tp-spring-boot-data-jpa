package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ProduitRepository;

public class ProduitServiceImpl implements ProduitService {
	
	ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		// TODO Auto-generated method stub
		return (List<Produit>) produitRepository.findAll();
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		Produit p = produitRepository.findById(id).get();
		return p;
	}

}
