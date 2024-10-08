package exercício_4;

import java.util.Scanner;

public class Problema_Numeros_Pares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you type?");

		int n = sc.nextInt();

		int realNumbers = 0;
		String evenNumbers = "";
		A a = new A();

		a.evenNumbers = new int[n];
		a.numbers = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Type your number: ");
			int number = sc.nextInt();

			if (number % 2 == 0) {

				realNumbers += 1;
				a.evenNumbers[i] = number;

			} else {
				a.numbers[i] = number;
			}

		}

		System.out.println("Even numbers: ");

		for (int e = 0; e < realNumbers; e++) {

			evenNumbers += " " + a.evenNumbers[e];

		}

		System.out.println(evenNumbers);

		System.out.println("Quantitiy of even numbers: " + realNumbers);

	}
}
