package application;

import java.util.Scanner;

public class Program_Tautologia {

	// Why you need tautologia in your program. Basically because if you know tautologia, is very good for detect errors in logical of program.
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		Boolean p;
		Boolean q;
		
		System.out.println("Digite o valor de p");
		p = sc.nextBoolean();
		System.out.println("Digite o valor de q");
		q = sc.nextBoolean();
		
		System.out.println(!(p && q) || (p || q)); // Always will you see true
		
		
		
		
		
	}
	
	
}
