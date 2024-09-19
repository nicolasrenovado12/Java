package recriando_Programa_Com_POO_65;

import java.util.Scanner;

import recriando_Programa_Com_POO_65.Triangle;

public class Recriando_programa_com_POO_65 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x;
		Triangle y;
		
		

		y = new Triangle();
		x = new Triangle();
		
		System.out.println("Enter the measures of Triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
	
		System.out.println("Enter the measures of Triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		System.out.printf("The area of triagle X: %.3f%n ", x.area());
		System.out.printf("The area of triagle Y: %.3f%n ", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("\narea X is bigger than area Y");		
		} else if (x.area() == y.area()){
			System.out.println("\narea Y and area X is equal");
		} else {
			System.out.println("\narea Y is bigger than area Y");
		}
	}
	
}
