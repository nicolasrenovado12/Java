package exercício_1;

import java.util.Scanner;

public class Exercício_1_Programa {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle.toString());
		
		sc.close();
	}
	
}
