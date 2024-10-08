package section_4_Exercicios_Fixação;

import java.util.Scanner;

public class Exercício4_modulo4 {

	public static void main(String[] args) {
		
		System.out.println("Valor que calcula a diferença; ");
		
		double salary;
		int number;
		double hours, moneyperhours;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque numero, horas, dinheiro por hora: ");
		number = sc.nextInt();
		hours = sc.nextDouble();
		moneyperhours = sc.nextDouble();
		salary = moneyperhours * hours;

		System.out.println("NUMBER = " + number);
		System.out.println("SAlARY = " + salary);
		
	}
	
}
