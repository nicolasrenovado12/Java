package services;

public class DisplayService {
	
	public static String display(double[][] matriz) {
		String display = "";
		for(int i=0; i<matriz.length; i++) {
			
			display += "| ";
			for(int j=0; j<matriz[i].length; j++) {
				display += String.format("%.0f", matriz[i][j]);
				
				
					display += " ";
				
			}
			
			display += "\n";
		}
		
		return display;
	}
	
}
