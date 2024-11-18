package application;

public class Program2 {

	public static void main(String[] args) {

		double juros = 0.0058;
		double quantidade = 0;
		double valorpormes = 1000;
		int ano = 0;
		int i = 0;
		while(quantidade < 100000) {
			
			quantidade += valorpormes * Math.pow((1 + juros),i);
			
			ano = (i/12) +1 ;
			int mes = (i%12) + 1;
			
			System.out.println(valorpormes);
			System.out.println("Ano = " + ano);
			System.out.println("Mês = " + mes + " " + quantidade+valorpormes);
			i+=1;
			if (mes == 1) {
				valorpormes+=200;
			}
			System.out.println(i +  " Meses");
			
			
			
		}
		
		
		
		
	}

}
