package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.repository.DetailFactureRepository;

@Service
public class DetailFactureServiceImpl implements DetailFactureService {
	
	
	@Autowired
    DetailFactureRepository detailFactureRepository;

	@Override
	public void addDetailFacture(DetailFacture detailFacture) {
		// TODO Auto-generated method stub
		if(!detailFactureRepository.findById(detailFacture.getIdDetailFacture()).isPresent()){
            detailFactureRepository.save(detailFacture);
        }else{
            System.out.println("Detail Facture Existe déja !!");
        }
		
	}

	@Override
	public DetailFacture getDetailFacture(long id) {
		// TODO Auto-generated method stub
		return detailFactureRepository.findById(id).get();
	}

}
