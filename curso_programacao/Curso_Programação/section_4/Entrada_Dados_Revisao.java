package section_4;

import java.util.Scanner;

public class Entrada_Dados_Revisao {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159265359;
		
		
		System.out.printf("%.2f%n", pi);
		
		System.out.println("Digite uma string: ");
		String string = sc.nextLine();
		System.out.println(string);
		

		System.out.println("Digite um inteiro: ");
		int integer = sc.nextInt();
		System.out.println(integer);
		

		System.out.println("Digite um número real: ");
		Double realNumber = sc.nextDouble();
		System.out.println(realNumber);
	}
	
	
}
