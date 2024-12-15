package services;

public class CalculateService {

	public static double[][] calculate(double[][] matriz1, double[][] matriz2) {
		double[][] novaMatriz = new double[matriz1.length][matriz1[0].length];
		
		for(int a=0; a<novaMatriz[0].length; a++) {
			for(int i=0; i<novaMatriz.length; i++) {

				
				for(int j=0; j<novaMatriz[i].length; j++) {
					
					novaMatriz[a][j] += matriz1[a][i] * matriz2[i][j];
					
					
				

				}
			}	
		}
		
		
		return novaMatriz;
		
		
	}
	
}
