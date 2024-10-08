package programa_Teste_OOP_1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		double a;
		
		Scanner sc = new Scanner(System.in);
		
		Objeto b;
		b = new Objeto();
		
		b.nome = sc.nextLine();
		a = b.a();
		
		System.out.println("Este é o nome: " + b.nome.toUpperCase() + a);
	}
	
	
}
