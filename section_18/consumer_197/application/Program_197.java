package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product_3;

public class Program_197 {

	public static void main(String[] args) {
	
		List<Product_3> list = new ArrayList<>();

		list.add(new Product_3("Tv", 900.00));
		list.add(new Product_3("Mouse", 50.00));
		list.add(new Product_3("Tablet", 350.50));
		list.add(new Product_3("HD Case", 80.90));
		
		double factor = 1.1;
		
		list.forEach((p) -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
	}
	
}
