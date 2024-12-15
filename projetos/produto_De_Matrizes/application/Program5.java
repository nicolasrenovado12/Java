package application;

import services.CalculateService;
import services.DisplayService;

public class Program5 {

	public static void main(String[] args) {
		
		double[][] matrizA = {{1, 2}, {3, 4}};
		double[][] matrizB = {{2, 4}, {3, 2}};

		
		System.out.print(DisplayService.display(matrizA));
		System.out.println("x");
		System.out.print(DisplayService.display(matrizB));
		System.out.println("=");
		System.out.println(DisplayService.display(CalculateService.calculate(matrizA, matrizB)));
	}
		
		
		
	}


