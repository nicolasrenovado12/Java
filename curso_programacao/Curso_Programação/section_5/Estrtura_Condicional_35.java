package section_5;

public class Estrtura_Condicional_35 {

	public static void main(String[] args ) {
		
		
		int hora = 7;
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Bom dia ");
		} else if (hora >= 13 && hora <= 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 19 && hora <= 23) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Boa madrugada");
		}
		
	}
	
	
	
}
