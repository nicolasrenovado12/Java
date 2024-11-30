package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program_156 {

	public static void main(String[] args) {
	
		String path = "c:\\a.txt";
		FileReader fr = null;
		BufferedReader bReader = null;
		
		try {
			fr = new FileReader(path);
			bReader = new BufferedReader(fr);
			
			String line = bReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bReader.readLine();
			} 
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (bReader != null) {
					bReader.close();	
				}
				if (fr != null) {
					fr.close();	
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
