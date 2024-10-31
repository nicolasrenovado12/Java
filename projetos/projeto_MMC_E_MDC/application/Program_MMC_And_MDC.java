package application;

import java.util.Scanner;

public class Program_MMC_And_MDC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mdc = 0;
		System.out.print("Enter your first number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int number2 = sc.nextInt();
		int a = number1 + number2;

		for (int i = 1; i < a + 1; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				mdc = i;
			}
		}
		int mmc = (number1 * number2) / mdc;

		System.out.println("This is your mdc: " + mdc);
		System.out.println("This is your mmc: " + mmc);

		sc.close();
	}

}
