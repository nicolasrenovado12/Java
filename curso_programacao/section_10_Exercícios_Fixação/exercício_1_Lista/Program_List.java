package exercício_1_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered? ");
		List<Integer> idList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		List<Double> salaryList = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i=1;i<n+1;i++) {
			
			System.out.println("Emplyoee #" + i);
			System.out.println("Id: "); int id = sc.nextInt();
			idList.add(id);
			System.out.println("Name: "); String name = sc.next();
			nameList.add(name);
			System.out.println("salary: "); double salary = sc.nextDouble();
			salaryList.add(salary);
			
			
			
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int searchId = sc.nextInt();
		
		
		
		
		System.out.println("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		int newId = idList.indexOf(searchId);
		double salaryQuery = salaryList.get(newId);
		
		salaryQuery = salaryQuery + (salaryQuery / 100 * percentage);
		salaryList.add(newId, salaryQuery);
		
		System.out.println("\nList of employees: ");
		for (int i=0; i<n;i++) {
			System.out.println(idList.get(i) + ", " + nameList.get(i) + ", " + salaryList.get(i));
		}
		
		
	}
	
	
	
}
