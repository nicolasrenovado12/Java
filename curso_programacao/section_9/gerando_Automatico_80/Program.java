package gerando_Automatico_80;

import java.util.Scanner;

import recriando_Programa_Com_POO_65e66.Triangle;

public class Program {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		
		System.out.println("Enter the measures of Triangle X: ");
		
		System.out.println("Enter the measures of Triangle Y: ");
	
		
		
		System.out.printf("The area of triagle X: %.3f%n ", x.area());
		System.out.printf("The area of triagle Y: %.3f%n", y.area());
		
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
