package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program_203 {

	public static void main(String[] args) {
	
		/*
		 * EXAMPLE FILE: 
		 * Maria,maria@gmail.com,3200.00
		 * Alex,alex@gmail.com,1900.00
		 * Marco,marco@gmail.com,1700.00
		 * Bob,bob@gmail.com,3500.00
		 * Anna,anna@gmail.com,2800.00
		 */
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList();
		System.out.print("Enter full file path: ");
		String path = sc.next();
		System.out.print("Enter full salary: ");
		double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] divisao = line.split(",");
				employees.add(new Employee(divisao[0], divisao[1], Double.parseDouble(divisao[2])));
				
				
				line = br.readLine();
			}
			List<String> emails = employees.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than 2000.00: ");
			emails.forEach(System.out::println);
			
			List<Employee> namesM = employees.stream().filter(e -> e.getName().toUpperCase().charAt(0) == 'M').collect(Collectors.toList());
			double valor = namesM.stream().map(x -> x.getSalary()).reduce((x,y) -> x + y).orElse(0.0);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + valor);
			
		} catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		
		
	}
	
	
}
