package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product_2;

public class Program_2_189 {

	public static void main(String[] args) {

		Map<Product_2, Double> stock = new HashMap<>();
		Product_2 p1 = new Product_2("Tv", 900.0);
		Product_2 p2 = new Product_2("Notebook", 1200.0);
		Product_2 p3 = new Product_2("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Product_2 ps = new Product_2("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
