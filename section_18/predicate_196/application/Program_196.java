package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product_3;
import util.ProductPredicate;

public class Program_196 {

	public static void main(String[] args) {

		List<Product_3> list = new ArrayList<>();

		list.add(new Product_3("Tv", 900.00));
		list.add(new Product_3("Mouse", 50.00));
		list.add(new Product_3("Tablet", 350.50));
		list.add(new Product_3("HD Case", 80.90));

		// list.removeIf((p) -> p.getPrice() >= 100); you could write this
		
		list.removeIf(Product_3::nonstaticProductPredicate);
		
		for (Product_3 product : list) { 
			System.out.println(product.toString());
		}
			
		
	}

}
