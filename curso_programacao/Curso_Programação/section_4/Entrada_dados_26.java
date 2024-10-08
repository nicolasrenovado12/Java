package section_4;
import java.util.Scanner;
public class Entrada_dados_26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);	
		System.out.println("Você digitou: " + x);	
		
		int y;
		y = sc.nextInt();
		y = (y * y) * (y / 2);
		System.out.println("Conta feita: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Seu número = %.2f%n ", z);
		
		sc.close();
		
	}	
}