package application;

import java.util.Scanner;

import entities.Shape;
import entities.Triangle;
import enums.Color;

public class Program_Shapes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digit height: ");
		double height = sc.nextDouble();

		System.out.print("Digit base: ");
		double width = sc.nextDouble();

		Shape triangle = new Triangle(height, width);

		System.out.println(triangle.area());

	}

}
