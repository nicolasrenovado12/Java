package section_4_Exercicios_Fixação;
import java.util.Scanner;

public class Exercício2_modulo4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Valor que calcula a área do circulo; ");
		
		double pi = 3.14159265359;
		double raio;
		double área;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o valor do raio: ");
		raio = sc.nextDouble();
		
		
		área = pi * Math.pow(raio, 2);
		
		System.out.println("A=" + área);
		
	}
	
	
}
