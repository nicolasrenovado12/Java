package section_7;

import java.util.Scanner;

public class Funções_61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A: ");
		int a = sc.nextInt();

		System.out.println("B: ");
		int b = sc.nextInt();
		String higher = max(a, b);
		
		System.out.println(higher);
		
	}
	public static String max(int a, int b) {
		String ab;
		
		if (a > b) {
			ab = "a";
		} else {
			ab = "b";
		}
		
		return ab;
	}
	

}
