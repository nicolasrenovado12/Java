package composição_123;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		// This program is difference than course.
		
		Scanner sc = new Scanner(System.in);

		
		Motor motorv8 = new Motor(8, 560);
		Carro carro = new Carro("Azul", "Volkswagen", motorv8);

		
		System.out.println("Informações do carro abaixo: ");
		System.out.println(carro.toString());
		

		sc.close();
		
	}
}
