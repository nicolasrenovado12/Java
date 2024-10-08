package section_6;

import java.util.Scanner;

public class Estrutura_enquanto_45 {

	public static void main(String[] args ) {
		
	Scanner sc = new Scanner(System.in);
		
	int x= sc.nextInt(), total=0;
	
	while (x != 0) {

		total += x;
	}
	
	System.out.println("O programa terminou ");
	
	System.out.println("Soma total: " + total);
	
	
	}
}
