package section_5;

import java.util.Scanner;

public class Switchcase_39 {

	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		String dia;
		int dian;
		
		dian = sc.nextInt();
		
		switch(dian) {
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Valor invalido";
			break;
				
		}
		
		System.out.println(dia);
		
	}
	
	
	
}
