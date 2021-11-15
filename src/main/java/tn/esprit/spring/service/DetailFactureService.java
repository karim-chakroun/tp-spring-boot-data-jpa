package tn.esprit.spring.service;

import tn.esprit.spring.entity.DetailFacture;

public interface DetailFactureService {

	void addDetailFacture(DetailFacture detailFacture);

    DetailFacture getDetailFacture(long id);
}
