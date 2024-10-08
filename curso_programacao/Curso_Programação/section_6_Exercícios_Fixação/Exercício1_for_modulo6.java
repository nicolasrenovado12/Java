package section_6_Exercícios_Fixação;

import java.util.Scanner;

public class Exercício1_for_modulo6 {
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N += 1;
		int soma=0;
		for (int i=0; i<N; i++ ) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(soma);

		
		
		}
}
