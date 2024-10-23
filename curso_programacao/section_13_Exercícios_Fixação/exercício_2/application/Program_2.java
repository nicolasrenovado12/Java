package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program_2 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int numbersProducts = sc.nextInt();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 1; i < numbersProducts + 1; i++) {
			System.out.print("Common, used or imported (c/u/i)? ");
			String cui = sc.next();

			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (cui.equals("c")) {
				list.add(new Product(name, price));
			} else if (cui.equals("u")) {

				System.out.print("Manafacture date (DD/MM/YYYY): ");
				String dateString = sc.next();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date date = formatter.parse(dateString);

				list.add(new UsedProduct(name, price, date));
				
			} else if (cui.equals("i")) {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				list.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.println("Você só pode digitar estas opções. ");
			}
		}

		System.out.println("PRICE TAGS: ");

		for (Product product : list) {
			System.out.println(product.priceTag());
		}

	}

}
