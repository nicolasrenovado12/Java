package application;

import java.util.Scanner;

import entities.Função_Afim;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que exibe 10 números do conjunto imagem da função feita pelo usuário");
		System.out.println("função afim(1) ");
		System.out.println("Você deseja qual função? ");
		int escolha = sc.nextInt();
		
		switch(escolha) {
		case 1:
			
			System.out.println("Digite o valor de a");
			double a = sc.nextDouble();
			System.out.println("Digite o valor de b");
			double b = sc.nextDouble();
			if (b > 0) {
				System.out.println("f(x) = "+ a + "x +" + b);	
			} else {
				System.out.println("f(x) = "+ a + "x " + b);
			}
			
			
			for(int x=0; x<10; x++) {
				System.out.println("Valor da sua função, dado o domínio = " + x + " = " + Função_Afim.Função_Afim(x, a, b));	
			}
			
			
			
			
			
			break;
		
		}
		
		
		
		sc.close();
		
		}
	
}
