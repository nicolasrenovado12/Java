package model.application;

import java.sql.*;
import java.util.Scanner;

import model.entities.Shopping_Cart;

public class Program {

	public static void main(String[] args) {
		String productOfUser = "";
		String[] products = {"Banana 100g", "Chicken", "1L of Milk", "5 kg of Rice", "1kg of Beans"};
		Double[] productsPrice = {3.00, 33.00, 4.00, 25.00, 9.00};
		Boolean a = true;
		
		Scanner sc = new Scanner(System.in);
		
			Shopping_Cart shoppingCart = new Shopping_Cart();
	
	
			do {
			System.out.println("This is a products of market: ");
			a(products, productsPrice);
			System.out.print("Which product do you want for your cart? ");
			productOfUser = sc.nextLine();
			
			for(int i=0; i<products.length; i++) {
				if (productOfUser.equals(products[i])) {
					shoppingCart.addCart(productOfUser);
					shoppingCart.calculatePrice(productOfUser, i, productsPrice);
					System.out.println(shoppingCart.toString());
					System.out.print("Do you want more shopping (y or n)?");
					String yorn = sc.nextLine();
					if (yorn.equals("n")) {
						a = false;
					} else {
						a = true;
					}	
				}
			}
			
		} while (a == true);
				
		
		
		
		
		
		sc.close();
	}
	public static void a(String[] products, Double[] productsPrice) {
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i] + " " + productsPrice[i]);
		}
		
	}
	
}
