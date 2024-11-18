package application;

import java.util.Scanner;

public class Program_Configuration {

	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please digit your hour (00:00): ");
		String hour = sc.nextLine();
		
		
		System.out.println("Hour = ");
		System.out.println(Program_Algorithm.create_ASCII_Hour(hour));
		sc.close();
	}
}
