package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;

@Service
public class FactureServiceImpl implements FactureService {
	@Autowired
	FactureRepository factureRepository;
	Facture facture;

	@Override
	public List<Facture> retrieveAllFactures() {
		// TODO Auto-generated method stub
		return (List<Facture>) factureRepository.findAll();
	}

	@Override
	public void cancelFacture(Long id) {
		factureRepository.findById(id).get().setActive(false);
		factureRepository.save(facture);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		Facture f = factureRepository.findById(id).get();
		return f;
	}
	
	@Override
	public void revenue() { 
		
		Date nowDate = new Date();
			
			@SuppressWarnings("deprecation")
			int nowMonth = nowDate.getMonth();
			
			@SuppressWarnings("deprecation")
			int nowYear= nowDate.getYear()+1900;
			
			float revenuPerMonth=0;
			float revenuPerYear=0;
			List<Facture>factures = (List<Facture>) factureRepository.findAll();
			
		
			for(Facture facture : factures)
			{
				@SuppressWarnings("deprecation")
				int factureMonth = facture.getDateFacture().getMonth();
				@SuppressWarnings("deprecation")
				int factureYear= facture.getDateFacture().getYear()+1900;
				
			if((facture.isActive()==true && factureMonth==nowMonth-1)&&(factureYear==nowYear)&&(factureMonth!=0))
				{
					
				revenuPerMonth = revenuPerMonth + (facture.getMontantFacture()-facture.getMontantRemise());
				
				}
			else if(facture.isActive()==true &&(nowMonth==0)&&(factureYear==nowYear-1))
			{
				revenuPerYear = revenuPerYear + (facture.getMontantFacture()-facture.getMontantRemise());
			}
				
		
		}
			
			int revenuMonth = nowMonth-1; 
			int revenuYear = nowYear; 
			log.info("le revenu de magasin pour le mois: "+revenuMonth+" est: "+revenuPerMonth);
			log.info("le revenu de magasin pour cette année: "+revenuYear+" est: "+revenuPerYear);
			
		}

}
