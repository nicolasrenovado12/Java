package encapsulamento_79;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Object object = new Object("a", 2);

		System.out.println("This a name of your object: " + object.getName());
				
		
		sc.close();
		
		
	}
	
	
}
