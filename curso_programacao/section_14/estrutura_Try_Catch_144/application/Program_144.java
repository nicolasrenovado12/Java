package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_144 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
	
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.print(vect[position]);
		} catch(InputMismatchException e) {
			System.out.print("Input error: " + e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("invalid position: " + e);
		}
		
		
		sc.close();
		
	}
	
}
