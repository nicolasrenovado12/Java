package exercício_1;

import java.util.Scanner;

public class Problema_Negativos {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int negativeN = 0;

		int[] numbers = new int[n];
		int[] negativeNumbers = new int[n];
		Object object = new Object(numbers, negativeNumbers);
		
		if (n > 10) {
			System.out.println("O número deve ser maior do que 10");
		} else {

			for(int i=0;i<n;i++) {
				int whichNumber = sc.nextInt();
				object.numbers[i] = whichNumber;
				if (object.numbers[i] < 0) {
					object.negativeNumbers[i] = object.numbers[i];
					negativeN += 1;
				}
				
				
			}
			System.out.println("NUMEROS NEGATIVOS: ");
			for(int i=0;i< negativeN ;i++) {

				System.out.println(object.negativeNumbers[i]);				
				
			}

			sc.close();
	
		}
	}
}
