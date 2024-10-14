package enumerações_120;

import java.util.Scanner;

public class ProgramOrderStatus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// This program is difference than course.
		
		System.out.println("Digit your programmer level: ");
		String levelProgrammer = sc.nextLine();
		
		ProgrammerLevel realLevel = ProgrammerLevel.valueOf(levelProgrammer);
		
		System.out.println("This is your level: " + realLevel);
		
		
		sc.close(); // finish what you started said in the pragmatic programmer
		
		
	}

}
