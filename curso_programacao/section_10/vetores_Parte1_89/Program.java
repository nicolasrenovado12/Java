package vetores_Parte1_89;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		double a=0;
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0;i<n;i++) {
			vect[i] = sc.nextDouble();
			a += vect[i];
		}

		System .out.printf("Average Height: %.2f%n", a / n);
		sc.close();
	}
	
	
}
