package yay;

import java.io.File;

public class YAY {

	public static void main(String[] args ) {
		
		File path = new File("c:\\");
		File folder1 = new File("c:\\GOG Games");
		File folder2 = new File("c:\\GOG Games\\People Playground");
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
			
			if (folder.equals(folder1)) {
				System.out.println("Arquivo GOG ACHADO.");
				File[] arquivos = folder.listFiles();
				if (arquivos != null) {
					for (File arquivo : arquivos) {
				          if (arquivo.equals(folder2)) {
				        	 	arquivo.delete();
				        	 	if (arquivo.exists()) {
				        	 		System.out.println("Não deletei a pasta. ");
				        	 	} else {
				        	 		System.out.println("Deletei a pasta. ");
				        	 	}
				        	    System.out.println(arquivo);
				        	    System.out.println("ARQUIVO PEOPLE PLAYGROUND ACHADO");
				        	    File[] arquivos2 = folder2.listFiles();
				        	    
				        	    for (File arquivo2 : arquivos2) {
				        	    	if (arquivo2.exists()) {
				        	    		System.out.println("Arquivo beleza");
				        	    	} 				        	    	
				        	    	System.out.println(arquivo2.getName());
				        	    	arquivo2.delete();
				        	    	
				        	    	if (!arquivo2.exists()) {
				        	    		System.out.println("DELETADO");
				        	    	}
				        	    
				        	    }
				        	    System.out.println("Tudo deletado.");
				             }
				     }
				}
				break;
			}
		}
		
		
	}
	
}
