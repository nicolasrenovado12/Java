package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product_5;
import util.ProductService;

public class Program_199 {

	public static void main(String[] args) {

		List<Product_5> list = new ArrayList<>();

		list.add(new Product_5("Tv", 900.00));
		list.add(new Product_5("Mouse", 50.00));
		list.add(new Product_5("Tablet", 350.50));
		list.add(new Product_5("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() > 100.0);

		System.out.println("Sum = " + String.format("%.2f", sum));


		
	}

}
