package application;

import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program_176 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService bis = new UsaInterestService(1.0);
		double payment = bis.payment(amount, months);

		System.out.println("Amount after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));

	}

}
