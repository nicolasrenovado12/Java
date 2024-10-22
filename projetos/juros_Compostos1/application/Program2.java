package application;

public class Program2 {

	public static void main(String[] args) {

		double capital = 0;
		double juros = 0.01;
		double valorpormes = 10;
		for (int i = 0; i < args.length; i++) {
			
		}
		for(int i=1; i< 12; i++) {
			
			double montante = capital * Math.pow(1 + juros, i);
			System.out.println("Mês " +  i +  " dinheiro  = " + montante);
		}
		
		
		
		
	}

}
