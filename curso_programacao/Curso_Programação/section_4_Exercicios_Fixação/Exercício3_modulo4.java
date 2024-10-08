package section_4_Exercicios_Fixação;
import java.util.Scanner;

public class Exercício3_modulo4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Valor que calcula a diferença; ");
		
		int diferenca;
		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a, b, c, d: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca =(a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
	}
	
	
}
