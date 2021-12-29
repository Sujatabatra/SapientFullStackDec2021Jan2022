package com.sujata.client;

import java.util.List;

import com.sujata.bean.Stock;
import com.sujata.service.ProductService;

public class BuyProduct {

	List<Stock> stocks;
	ProductService productService;
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public double getTotalPrice() {
		double totalPrice=0.0;
		for(Stock stock:stocks) {
			totalPrice=totalPrice+stock.getQuantity()*productService.getPrice(stock);
		}
		return totalPrice;
	}
}
