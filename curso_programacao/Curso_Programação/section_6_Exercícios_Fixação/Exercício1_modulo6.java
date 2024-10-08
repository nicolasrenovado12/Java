package section_6_Exercícios_Fixação;

import java.util.Scanner;

public class Exercício1_modulo6 {

	public static void main(String[] args ) {
		
	Scanner sc = new Scanner(System.in);
		
	int senha = 2002, entrada=sc.nextInt();
	
	while (entrada != senha) {

		if (entrada != senha) {
			
			System.out.println("Senha invalida ");
			
		}
		
		entrada=sc.nextInt();
		

	}
	
	System.out.println("Acesso Permitido ");

	
	
	}
}
