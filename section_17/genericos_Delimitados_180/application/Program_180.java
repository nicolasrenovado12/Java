package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program_180 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Product> list = new ArrayList<>();
		
		String path = "D:\\g.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			for(Product product : list) {
				System.out.println(product.toString());
			} 
			Product x = CalculationService.max(list);
			System.out.println("Most Expensive: ");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
