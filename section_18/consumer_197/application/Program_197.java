package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product_2;
import util.PriceUpdate;

public class Program_197 {

	public static void main(String[] args) {
	
		List<Product_2> list = new ArrayList<>();

		list.add(new Product_2("Tv", 900.00));
		list.add(new Product_2("Mouse", 50.00));
		list.add(new Product_2("Tablet", 350.50));
		list.add(new Product_2("HD Case", 80.90));
		
		list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
	}
	
}
