package application;

import java.util.Scanner;

public class Program_Escada {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de degraus");
		int degraus = sc.nextInt();
		String objeto = "";

		for (int i=0; i<degraus; i++) {
			
			
			objeto+=" ";
				
			
		}
		String novo = objeto;
		for (int i=0; i<degraus; i++) {
			novo = novo.replaceFirst(" ", "");
			novo +="#";
			System.out.println(novo);
		}

		
		
	
	}
	
}