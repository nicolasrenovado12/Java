package exercício_4;

import java.util.Scanner;

public class Exercício_4_Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dolar price? "); double priceDollar = sc.nextDouble();
		System.out.println("How many dollar a will be bought? "); double money = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n ", converter(priceDollar, money));
		
		
		
		
	}

	
	public static double converter(double priceDollar, double money) {
		money = money + (money * 0.06);
		return money * priceDollar;
	}
	
	
	
}
