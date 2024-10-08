package section_4;

import java.util.Locale;

public class Exercício_de_fixação_24 {

	public static void main(String[] args) {
		// Char need a this syntax 'm'.
		String product1 = "Computer";
		String product2 = "Office  desk";
		
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Products: \n" + product1 + ", which price is $" + price1 + "\n" + product2 + ", which price is $" + price2 + "\n");
		System.out.println("Record: " + age + " years old, " + code + " and gender: " + gender);
		
		System.out.println("Measue with eight decimal places: " + measure);

		System.out.printf("Rouded (three decimal places) %.3f%n ", measure);

		Locale.setDefault(Locale.CHINA);
		System.out.printf("China decimal point: %.3f%n " , measure);
		
	}
	
	
}
