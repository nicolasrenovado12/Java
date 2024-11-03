package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_Teste {

	public static void main(String[] args) throws IOException {

		File file = new File("c:\\a.txt");
		Scanner sc = null;
		int c = 0;
		FileWriter fWriter = new FileWriter("c:\\a.txt");
		String a = "a";
		fWriter.write(a);
		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
