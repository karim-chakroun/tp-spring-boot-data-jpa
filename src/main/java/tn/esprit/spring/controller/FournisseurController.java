package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Founisseur;
import tn.esprit.spring.service.FournisseurServiceImpl;

@RestController
@RequestMapping("/Fournisseur")
public class FournisseurController {
	
	
	@Autowired
    private FournisseurServiceImpl founisseurService;

    // http://localhost:8089/SpringMVC/api/fournisseur/getAllFournisseur
    @GetMapping("/getAllFournisseur")
    public List<Founisseur> getFounisseurs() {
        List<Founisseur> listFournisseurs = founisseurService.getFournisseurs();
        return listFournisseurs;
    }

    // http://localhost:8089/SpringMVC/api/fournisseur/addClient
    @PostMapping("/addFournisseur")
    public void addClient(@RequestBody Founisseur f)
    {
        founisseurService.addFournisseur(f);

    }

    // http://localhost:8089/SpringMVC/api/fournisseur/getFournisseurById/{id}
    @PostMapping("/getFournisseurById/{id}")
    public Founisseur getFounisseurById(@PathVariable int id)
    {
    	Founisseur fournisseur=founisseurService.getFournisseurById(id);
        return  fournisseur;

    }

    // http://localhost:8089/SpringMVC/api/fournisseur/deleteFournisseur
    @PostMapping("/deleteFournisseur")
    public void deleteFounisseur(@RequestBody Founisseur f)
    {
       founisseurService.deleteFournisseur(f);


    }

}
