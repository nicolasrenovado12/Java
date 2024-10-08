package membros_estaticos_71;

import java.util.Scanner;

public class Programa {
	
	public static final double PI = 3.14159265359;

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n ", c);

		System.out.printf("Volume: %.2f%n", v);

		System.out.printf("Pi: %.2f%n", PI);
		
		

		
		
	
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	
}
