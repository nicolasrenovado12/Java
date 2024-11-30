package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		String path = "c:\\a.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			System.out.println(line == "Good morning");		
			while(line != null && line != "as") {
				System.out.println(line);
				line = br.readLine();
			}
		
			
		} catch (IOException a) {
			System.out.print("asd");
		}
		
		
	}
	
}
