package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.Outsourced_Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();

		
		System.out.println("Enter the employees: ");
		int numbersEmployees = sc.nextInt();
		
		
		for(int i=1; i<numbersEmployees+1; i++) {
			System.out.println("Enter #" + i + " data");
			System.out.print("Outsourced (y/n)");
			String outsourced = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (outsourced.equals("y")) {
				System.out.print("Addtional charge: ");
				double additionalCharge = sc.nextDouble();
				
				 list.add(new Outsourced_Employee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
			
			
	
		}
		System.out.println("PAYMENTS: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		
	}

}
