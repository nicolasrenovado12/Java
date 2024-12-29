package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product_5;

public class ProductService {

	public double filteredSum(List<Product_5> list, Predicate<Product_5> criteria) {
		double sum = 0.0;
		for (Product_5 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
			
		}
		return sum; 
	}
	
}
