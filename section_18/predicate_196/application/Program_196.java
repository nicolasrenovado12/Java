package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product_3;

public class Program_196 {

	public static void main(String[] args) {

		List<Product_3> list = new ArrayList<>();

		list.add(new Product_3("Tv", 900.00));
		list.add(new Product_3("Mouse", 50.00));
		list.add(new Product_3("Tablet", 350.50));
		list.add(new Product_3("HD Case", 80.90));

		// list.removeIf((p) -> p.getPrice() >= 100); you could write this
		
		double min = 100.0;
		
		Predicate<Product_3> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);
		
		for (Product_3 product : list) { 
			System.out.println(product.toString());
		}
			
		
	}

}