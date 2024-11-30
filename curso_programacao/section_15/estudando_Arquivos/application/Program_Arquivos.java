package application;

import java.io.File;

public class Program_Arquivos {

	public static void main(String[] args) {
		
		File path = new File("c:\\");
		File file2 = new File("c:\\robocode");
		File DiskD = new File("d:\\");
		File[] foldersDiskC = path.listFiles(File::isDirectory);
		File[] foldersDiskD = DiskD.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folderDiskC : foldersDiskC) {
			System.out.println(folderDiskC);
			if (folderDiskC.equals(file2)) {
				System.out.print("ROBOCODES");
				break;
			}
		}
		for (File folderDiskD : foldersDiskD) {
			System.out.println(folderDiskD);}
		}
	}
	

