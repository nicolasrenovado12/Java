package exercício_2;

import java.util.Scanner;

public class Problema_Soma_Vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		String values = "Values = ";
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		

		Object object = new Object(new double[n]);
		
		
		for(int i=0; i<n; i++) {

			
			System.out.println("Digite um número: ");
			int whichNumber = sc.nextInt();
			object.numbers[i] = whichNumber;
			sum += object.numbers[i];
			values = values + " " + object.numbers[i];
			
			System.out.println(object.numbers[i]);
		}

		System.out.println(values);

		System.out.println("Sum = " + sum);
		

		System.out.println("Average = " + sum / n);
	}
	
	
}
