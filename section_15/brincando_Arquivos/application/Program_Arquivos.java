package application;

import java.io.File;

public class Program_Arquivos {

	public static void main(String[] args) {
		
		File path = new File("c:\\");
		File file2 = new File("c:\\robocode");
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
			if (folder.equals(file2)) {
				System.out.print("ROBOCODES");
				break;
			}
		}
	}
	
}
