package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product_2;

public class Program_193 {

	public static void main(String[] args) {
		// Ordenando a lista de forma que fique manutenivel.

		List<Product_2> list = new ArrayList<>();
		list.add(new Product_2("TV", 1000.0));
		list.add(new Product_2("Notebook", 1200.0));
		list.add(new Product_2("Tablet", 450.0));

		Comparator<Product_2> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};

		list.sort(comp);

		for (Product_2 p : list) {
			System.out.println(p.toString());
		}

	}

}
