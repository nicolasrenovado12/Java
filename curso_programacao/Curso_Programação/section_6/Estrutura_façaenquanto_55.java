package section_6;

import java.util.Scanner;

public class Estrutura_façaenquanto_55 {

	public static void main(String[] args ) {
		
	Scanner sc = new Scanner(System.in);
	char resp;

	do {
		int x;
		int total=0;
		x=sc.nextInt();

		while (x != 0) {
			x = sc.nextInt();
			total += x;
		}
		
		System.out.println("O programa terminou ");
		System.out.println("Soma total: " + total);

		System.out.println("Deseja repetir (s/n)?");
		resp = sc.next().charAt(0);
		
	} while(resp == 's');	
	
	}
}
