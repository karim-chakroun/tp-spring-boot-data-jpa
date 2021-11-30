package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;

@Service
@Slf4j
public class StockServiceImpl implements StockService {
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		return (List<Stock>) stockRepository.findAll();
	}

	@Override
	public Stock addStock(Stock s) {
		// TODO Auto-generated method stub
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		return stockRepository.save(u);
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		Stock s = stockRepository.findById(id).get();
		return s;
	}
	
	
	
	


	@Scheduled(fixedRate = 60000)
	public void getStockRupture() {
	
	List<Stock> stocks = (List<Stock>) stockRepository.findAll();
	
	for(Stock stock : stocks)
	{
		
		if(stock.getQte()==0){
			log.info("Le stock : "+stock.getLibelleStock()+" est en repture!"); 
		}
		else if(stock.getQte() == stock.getQteMin())
		{
			log.info("Le stock : "+stock.getLibelleStock()+" a atteint sa quantité minimale."); 
		}
		
		else if(stock.getQte()<stock.getQteMin())
		{
			log.info("Le stock : "+stock.getLibelleStock()+" risque une repture!"); 
		}		
	}
	}

}
