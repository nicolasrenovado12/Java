package exercício_2;

import java.util.Scanner;

public class Exercício_2_Programa {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();

		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		employee.NetSalary();
		
		System.out.println("Employee: " + employee.toString().formatted(args));
		
		System.out.println("Which percentage to increase salary? ");
		employee.percentage = sc.nextDouble();
		employee.IncreaseSalary();
		
		System.out.println("Employee: " + employee.toString());

		
		sc.close();
	}
	
}
