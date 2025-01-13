package application;

import java.util.Scanner;
import java.math.*;
public class Program_Razão_Trigonometrica {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double hypotenuse = sc.nextDouble();
		double angle = sc.nextDouble();
		System.out.println("Sin and cos " + String.format("%.2f", Math.sin(Math.toRadians(angle))) + " " +  String.format("%.2f", Math.cos(Math.toRadians(angle))));
		double height = hypotenuse * Math.sin(Math.toRadians(angle));
		double width  = hypotenuse * Math.cos(Math.toRadians(angle));
		
		System.out.println("Height = " + String.format("%.2f", height) + " Width = " + String.format("%.2f", width));
		
		
		
	}
	
}
