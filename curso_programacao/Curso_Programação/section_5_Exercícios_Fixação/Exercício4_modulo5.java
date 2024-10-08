
package section_5_Exercícios_Fixação;
import java.util.Scanner;

public class Exercício4_modulo5 {

	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		int horainicial, horafinal, calculo, hora, calculo2, calculo3;
		
		horainicial = sc.nextInt(); 
		horafinal = sc.nextInt();

		
		if (horainicial == horafinal) {
			System.out.println("0");
		} else if (horainicial > horafinal) {
			calculo2 = 24 - (horainicial - horafinal);
			
			System.out.println(calculo2);
		} else {

			calculo = horafinal - horainicial;
			
			System.out.println(calculo);
		}
		
	}
		
}
	
	
	

