package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product_2;

public class Program_193 {

	public static void main(String[] args) {
		// Ordenando a lista de forma que fique manutenivel.
		
		List<Product_2> list = new ArrayList<>();
		list.add(new Product_2("TV", 1000.0));
		list.add(new Product_2("Notebook", 1200.0));
		list.add(new Product_2("Tablet", 450.0));
		
		list.sort(new MyComparator( ));
		
		for(Product_2 p : list) {
			System.out.println(p.toString());
		}
		
	}
	
}
