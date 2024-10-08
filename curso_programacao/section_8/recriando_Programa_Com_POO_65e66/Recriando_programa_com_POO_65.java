package recriando_Programa_Com_POO_65e66;

import java.util.Scanner;

import recriando_Programa_Com_POO_65e66.Triangle;

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
			System.out.println("\nArea X is larger than area Y.");		
		} else if (x.area() == y.area()){
			System.out.println("\nArea Y and area X are equal.");
		} else {
			System.out.println("\nArea Y is larger than area X.");
		}

		sc.close();	
	}
	
}
