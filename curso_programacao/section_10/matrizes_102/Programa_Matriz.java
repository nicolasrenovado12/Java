package matrizes_102;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String l;
		String as = "";
		int c = 0;
		int n = sc.nextInt();
		int numbers[][] = new int[n][n];
		List<Integer> listNegative = new ArrayList<>();
		int b = 0;
		System.out.println(n);

		
		for (int e =0; e < n; e++) {
			for (int i = 0; i < n; i++) {
				numbers[e][i] = sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				c = numbers[e][j];
				if (numbers[e][j] < 0) {
					listNegative.add(numbers[e][j]);
					
				} 
				if (j == n-1) {
					
				} else {
					as = as + c ;
					
				}
			}
			as = as + c + "\n";
			
		}

		System.out.println(as);
		System.out.println(listNegative.size() + " Negative numbers: ");
		
		for(int i=0; i<listNegative.size(); i++) {
			System.out.println(listNegative.get(i));
		}

	}

}
