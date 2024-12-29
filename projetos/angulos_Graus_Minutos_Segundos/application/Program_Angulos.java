package application;

import java.util.Scanner;

public class Program_Angulos {

	public static void main(String[] args) {

		int graus = 0;
		int minutos = 0;
		int segundos = 0;
		int diminuicao;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite os graus (se não houver digite 0): ");
		graus += sc.nextInt();
		System.out.print("Digite os minutos (se não houver digite 0): ");
		minutos += sc.nextInt();
		System.out.print("Digite os segundos (se não houver digite 0): ");
		segundos += sc.nextInt();

		if (minutos % 60  < 1 || minutos % 60 >= 1) {
			
			graus += minutos / 60;
			
			if (minutos % 60 >= 1) {
				diminuicao = minutos;
				minutos += minutos % 60;	
				minutos -= diminuicao;
			}
			
			
		}
		if (segundos % 60 < 1 || segundos % 60 >= 1) {
			
			minutos += segundos / 60;
			
			if (segundos % 60 >= 1) {
				diminuicao=segundos;
				segundos += segundos % 60;
				segundos -= diminuicao;
				
			}
			
		}
		
		System.out.println("graus: " + graus + " minutos: " + minutos  + " segundos: " + segundos);
		
		
		
	}

}
