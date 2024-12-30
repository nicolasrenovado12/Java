package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program_202 {

	public static void main(String[] args) {

		/*
		 * Read file and make object Product with these informations,
		 * and make average with products. This program will show
		 * the products that haves price small than average.
		 * 
		 * EXAMPLE INPUT FILE: 
		 * Tv,900.0
		 * Mouse,50.0
		 * Tablet,350.50
		 * HD Case,80.90
		 * Computer,850.0
		 * Monitor,290.0
		 */
		int quantidade = 0;
		double soma = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a localização do arquivo: ");
		String path = sc.nextLine();
		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			
			while(line != null) {
			
				String[] divisao = line.split(",");
				list.add(new Product(divisao[0], Double.parseDouble(divisao[1])));
				soma += list.get(quantidade).getPrice();
				quantidade+=1;
				line = br.readLine();
				
			}
			media = soma / quantidade;
			Comparator<String> comparator = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());
			List<String> produtosMenores = list.stream().filter(x -> x.getPrice() < media).map(p -> p.getName()).sorted(comparator.reversed()).collect(Collectors.toList());
			
			System.out.println("Average price: " + String.format("%.2f", media));

			produtosMenores.forEach(System.out::println);
			
			
		} catch (IOException e) {
			System.out.println("IOException = " + e);
		}

	}

}
