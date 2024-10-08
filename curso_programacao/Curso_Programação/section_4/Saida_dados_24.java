package section_4;

public class Saida_dados_24 {

	public static void main(String[] args) {
		// Char need a this syntax 'm'.
		double n = 3.97871842;
		String genero = "MACHO"; 
		String nome = "Nicolas";
		double salario = 1440.2;
		System.out.println("FORMATADO " + n + " DEMAIS");

		System.out.printf("%.2f%n", n);
		System.out.printf("RESULTADO = %.2f metros %n", n); // Formated variable need a this syntax 
		System.out.printf("My name is %s, and my gender is %s but I am poor because my wage is %.2f", nome, genero, salario); // Double need a formated type for your function. 		
	
		// \n is exist
	}
	
	
}
