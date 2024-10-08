package section_8;

import java.util.Scanner;

public class Programa_sem_POO_64 {

	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of Triangle X: "); 
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of Triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("The area of triagle X: %.3f%n ", areaX);
		System.out.printf("The area of triagle Y: %.3f%n ", areaY);
		
		if (areaX > areaY) {
			System.out.println("\narea X is bigger than area Y");		
		} else if (areaX == areaY){
			System.out.println("\narea Y and area X is equal");
		} else {
			System.out.println("\narea Y is bigger than area Y");
		}
		
	}
	
	
}
