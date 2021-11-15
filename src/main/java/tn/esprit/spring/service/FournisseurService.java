package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Founisseur;

public interface FournisseurService {
	public void addFournisseur(Founisseur fournisseur);
    public Founisseur getFournisseurById(long id);
    public List<Founisseur> getFournisseurs();
    public void deleteFournisseur(Founisseur fournisseur);

}
