package tn.esprit.examen.services;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.StockService;

public class StockServiceImplTest {
	
	@Autowired
	StockService stockService;
	@Test
	public void testAddStock() {
		Stock s = new Stock(100, 10, "stock test");
		Stock savedStock= stockService.addStock(s);
		assertEquals(s.getLibelleStock(), savedStock.getLibelleStock());
		
	}
	
	@Test
	public void testRetrieveAllStocks() {
	List<Stock> allStocks = stockService.retrieveAllStocks();
	assertEquals(7, allStocks.size());
	}
	@Test
	public void testRetrieveStock() {
	Stock stock = stockService.retrieveStock(5L);
	assertEquals(5L, stock.getIdStock());
	}
	
	/*public void testAddStock() {
	List<Stock> stocks = stockService.retrieveAllStocks();
	int expected=stocks.size();
	Stock s = new Stock();
	s.setLibelleStock("stock test");
	s.setQte(10);
	s.setQteMin(100);
	Stock savedStock= stockService.addStock(s);
	assertEquals(expected+1, stockService.retrieveAllStocks().size());
	assertNotNull(savedStock.getLibelleStock());
	stockService.deleteStock(savedStock.getIdStock());
	*/
	

}
