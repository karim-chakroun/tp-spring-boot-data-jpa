package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.service.DetailFactureServiceImpl;

public class DetailFactureController {
	
	@Autowired
    private DetailFactureServiceImpl detailFactureService;

    // http://localhost:8089/SpringMVC/api/detailFacture/getDetailFacture
    @GetMapping("/getAllDetailFactures")
    public DetailFacture getDetailFactureById(@PathVariable int id) {
       DetailFacture detailFacture = detailFactureService.getDetailFacture(id);
        return detailFacture;
    }

    // http://localhost:8089/SpringMVC/api/detailFacture/addDetailFacture
    @PostMapping("/addDetailFacture")
    public void addDetailFacture(@RequestBody DetailFacture detailFacture)
    {
        detailFactureService.addDetailFacture(detailFacture);

    }

}
