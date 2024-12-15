package application;

import java.util.Scanner;

import services.PrintService;

public class Program_179 {

	public static void main(String[] args) {
		
		PrintService ps = new PrintService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values?");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
		
		
	}
}
