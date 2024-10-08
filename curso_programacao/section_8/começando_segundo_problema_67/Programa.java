package começando_segundo_problema_67;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); 
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		
		
		product.name = sc.nextLine();
		System.out.println("Price: ");
					
				
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
				
				
		product.quantity = sc.nextInt();

		System.out.println(product.toString());
		

		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		

		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be remove in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		

		System.out.println(product.toString());
		
	
			
		sc.close();	
	}
}
