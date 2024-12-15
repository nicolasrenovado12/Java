package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program_175 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		String path = "D:\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] separacao = line.split(",");
				String name = separacao[0];
				double salary = Double.valueOf(separacao[1]);
				list.add(new Employee(name, salary));
				line = br.readLine();
			}
			Collections.sort(list);
			for (Employee s : list) {
				System.out.println(s.getName() + " " + s.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}