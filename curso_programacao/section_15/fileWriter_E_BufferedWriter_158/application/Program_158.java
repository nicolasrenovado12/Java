package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_158 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\\\a.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	} 
	
	
}
