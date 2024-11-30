package application;

import java.io.File;
import java.util.Scanner;

public class Program_160 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getName: " + path.getParent());
		System.out.println("getName: " + path.getFreeSpace());
		
		sc.close();
	}
		
}
