package composição_123;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter department's name: ");
		String departmentName = sc.next();

		Department department = new Department(departmentName);

		System.out.println("Enter worker data: ");

		System.out.println("Name: ");
		String name = sc.next();
		
		System.out.println("Level: ");
		String level = sc.next();
		
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, baseSalary, level);
		
		System.out.println("How many contracts to this worker? ");
		int contracts = sc.nextInt();
		
		for(int i=0; i<contracts; i++) {
			
		}
		
	}
}
