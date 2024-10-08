package construtores_76;

import java.util.Scanner;

public class Program {

	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Name: ");
		String name = sc.nextLine();

		System.out.println("Gross salary: ");
		Double grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		Double tax = sc.nextDouble();
		
		Employee employee = new Employee(name , grossSalary, tax);
		
		
		employee.NetSalary();
		
		System.out.println("Employee: " + employee.toString().formatted(args));
		
		System.out.println("Which percentage to increase salary? ");
		employee.percentage = sc.nextDouble();
		employee.IncreaseSalary();
		
		System.out.println("Employee: " + employee.toString());

		
		sc.close();
	}
	
}
