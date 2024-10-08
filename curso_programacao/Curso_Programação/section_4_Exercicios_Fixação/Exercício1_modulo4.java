package section_4_Exercicios_Fixação;
import java.util.Scanner;

public class Exercício1_modulo4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Programa de soma; ");
		
		int a, b;
		int soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o valor de a: ");
		a = sc.nextInt();
		
		System.out.println("Coloque o valor de b: ");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
	}
	
	
}
