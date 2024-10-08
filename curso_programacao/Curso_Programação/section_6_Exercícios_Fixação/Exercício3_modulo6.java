package section_6_Exercícios_Fixação;

import java.util.Scanner;

public class Exercício3_modulo6 {
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
			
		int alcool=0, diesel=0, gasolina=0, entrada=sc.nextInt();
		
		

		
				
		while (entrada != 4) {
			
			switch(entrada) {
			case 1:
				alcool += 1;
				break;
			case 2:
				diesel += 1;
				break;
			case 3:
				gasolina += 1;
				break;
			default:
				System.out.println("O programa quebrou. ");
				break;
						
			}	
			
			entrada=sc.nextInt();
			

		}
		
		System.out.println("MUITO OBRIGADO \n Alcool: "+ alcool +" \n Diesel: " + diesel + " \n Gasolina:" + gasolina);

		
		
		}
}
