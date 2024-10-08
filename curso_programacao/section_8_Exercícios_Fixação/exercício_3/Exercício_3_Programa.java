package exercício_3;

import java.util.Scanner;

public class Exercício_3_Programa {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		

		System.out.println("The max first note is 30 and max others notes is 35: ");
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		
		System.out.println("First note: ");
		student.firstNote = sc.nextDouble();

		System.out.println("Second note: ");
		student.secondNote = sc.nextDouble();
		
		System.out.println("Third note: ");
		student.thirdNote = sc.nextDouble();
		
		System.out.println(student.calculate());

		
		sc.close();
	}
	
}
