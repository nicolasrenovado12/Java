package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product_2;

public class Program_196 {

	public static void main(String[] args) {

		List<Product_2> list = new ArrayList<>();

		list.add(new Product_2("Tv", 900.00));
		list.add(new Product_2("Mouse", 50.00));
		list.add(new Product_2("Tablet", 350.50));
		list.add(new Product_2("HD Case", 80.90));

		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);
		list.forEach(System.out::println);
			
		
	}

}
