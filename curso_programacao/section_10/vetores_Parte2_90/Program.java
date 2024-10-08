package vetores_Parte2_90;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double average = 0;
		String[] productName = new String[n];
		double[] productPrice= new double[n];
		Products products = new Products(productName, productPrice);
		
		
		for(int i=0;i<n;i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			products.productName[i] = name;
			products.productPrice[i] = price;
			
			average += 0 + products.productPrice[i] / n;
			
		}

		System .out.printf("Average Height: %.2f%n", average);
		sc.close();
	}
}
