package programs;

import java.util.Scanner;

import objects.Action;

public class Program_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Action action = new Action("BancoBrasil", 27.10, 0.183);
		

		System.out.println("Quantity of actions for want your buy: ");
		double quantity = sc.nextInt();
		
		double quantityAction = action.actionNumber * quantity;
		System.out.println(quantityAction);
		
		for (int i=1; i<11; i++) {
			System.out.printf("%.2f%n", (quantityAction * Math.pow(1+0.009, i+1)));
		}
		
	}
	
	
	
	
}
