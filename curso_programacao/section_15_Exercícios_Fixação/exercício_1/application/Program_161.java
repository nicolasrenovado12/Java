package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Program_161 {

	public static void main(String[] args) {
		
		
		File path = new File("D:\\");
		
		File[] files = path.listFiles();
		
		for(File file : files) {
			
			String fileString = file.toString();
			System.out.println(file);
			
			if (fileString.contains(".csv")) {
				System.out.println("BANANA");
				try (BufferedReader br = new BufferedReader(new FileReader(file))){
					
					String line = br.readLine();
					File summary = new File("D:\\out\\summary.csv.txt");
					if (summary.createNewFile()) {
						System.out.println("ARQUIVO CRIADO!");
					}
					ArrayList<String> lines2 = new ArrayList<String>();
					int n = 0;
					while(line != null) {
						
						String[] separacao = line.split(",");
						double n1 = Double.valueOf(separacao[1]);
						double n2 = Double.valueOf(separacao[2]);
						double quantidade = n1 * n2;
						String completa = separacao[0] + "," + quantidade;
						lines2.add(completa);
						System.out.println(completa);
						line = br.readLine();
					} 
					try(BufferedWriter bw = new BufferedWriter(new FileWriter(summary, true))) {
						for (String line2 : lines2) {
							bw.write(line2);
							bw.newLine();
						}	
					}
					
				} catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			}

		}
		
		
	}
	
	
}
