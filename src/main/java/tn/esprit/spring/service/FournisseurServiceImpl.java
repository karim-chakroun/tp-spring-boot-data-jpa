package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Founisseur;
import tn.esprit.spring.repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements FournisseurService {

	@Autowired
	FournisseurRepository fourniseurRepository;
	@Override
	public void addFournisseur(Founisseur fournisseur) {
		// TODO Auto-generated method stub
		if(!fourniseurRepository.findById((long) fournisseur.getIdFournisseur()).isPresent()){
            fourniseurRepository.save(fournisseur);
        }else{
            System.out.println("Fournisseur existe déja");
        }
		
	}

	@Override
	public Founisseur getFournisseurById(long id) {
		// TODO Auto-generated method stub
		 return fourniseurRepository.findById(id).get();
	}

	@Override
	public List<Founisseur> getFournisseurs() {
		// TODO Auto-generated method stub
		return fourniseurRepository.findAll();
	}

	@Override
	public void deleteFournisseur(Founisseur fournisseur) {
		// TODO Auto-generated method stub
		fourniseurRepository.delete(fournisseur);
		
	}

}
