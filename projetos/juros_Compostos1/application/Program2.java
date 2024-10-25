package application;

import java.text.DecimalFormat;

public class Program2 {

	public static void main(String[] args) {

		double capital = 1000;
		double valorpormes = 10;
		double juros = 0.01;
		double montante;
		double montante2 = 0;
		for(int i=1; i< 12; i++) {
			
			
			montante2 = montante2 + valorpormes * Math.pow(1 + juros, i);
			
			montante = capital * Math.pow(1 + juros, i);
			
			montante2+=10;
			
			System.out.println(i + " " + montante2);

		}
			
		
		
		
		
	}

}
