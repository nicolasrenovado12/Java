package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product_4;

public class Program_198 {

	public static void main(String[] args) {
		
		List<Product_4> list = new ArrayList<>();

		list.add(new Product_4("Tv", 900.00));
		list.add(new Product_4("Mouse", 50.00));
		list.add(new Product_4("Tablet", 350.50));
		list.add(new Product_4("HD Case", 80.90));
				
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

		
	}
	
}
