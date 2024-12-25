package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product_2;

public class Program_194 {
	public static int compareProducts(Product_2 p1, Product_2 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product_2> list = new ArrayList<>();
		
		list.add(new Product_2("TV", 900.00));
		list.add(new Product_2("Notebook", 1200.00));
		list.add(new Product_2("Tablet", 450.00));
		
		list.sort(Program_194::compareProducts);
		
		list.forEach(System.out::println);
	}
}
