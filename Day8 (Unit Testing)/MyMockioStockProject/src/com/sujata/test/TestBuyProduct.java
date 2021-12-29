package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.sujata.bean.Stock;
import com.sujata.client.BuyProduct;

import com.sujata.service.ProductService;

class TestBuyProduct {

	private BuyProduct buyProduct;
	private ProductService productService;
	
	@BeforeEach
	void setUp() throws Exception {
		buyProduct=new BuyProduct();
		
		productService=Mockito.mock(ProductService.class);

		List<Stock> stocks=new ArrayList<Stock>();
		stocks.add(new Stock(101, "Pencil", 10));
		stocks.add(new Stock(102, "Pen", 5));
		stocks.add(new Stock(103, "Eraser", 2));
		
		buyProduct.setStocks(stocks);
		buyProduct.setProductService(productService);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//adding behaviour to mocked /mimiced services
		when(productService.getPrice(new Stock(101, "Pencil", 10))).thenReturn(10.0);
		when(productService.getPrice(new Stock(102, "Pen", 5))).thenReturn(100.0);
		when(productService.getPrice(new Stock(103, "Eraser", 2))).thenReturn(5.0);
				
		assertEquals(610, buyProduct.getTotalPrice());

	}

}
