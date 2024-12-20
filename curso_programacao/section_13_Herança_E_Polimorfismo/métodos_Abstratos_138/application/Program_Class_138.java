package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program_Class_138 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of the shapes: ");
		int numbershapes = sc.nextInt();
		
		for(int i=0;i<numbershapes;i++) {
			
			System.out.print("Rectangle or circle (r/c)? ");
			String rectangleorcircle = sc.next();
			
			if (rectangleorcircle.equals("r")) {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String stringcolor = sc.next();				
				Color color = Color.valueOf(stringcolor);
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Shape rectangle = new Rectangle(color, width, height);
				
			} else if (rectangleorcircle.equals("c")) {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String stringcolor = sc.next();				
				Color color = Color.valueOf(stringcolor);
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Shape circle = new Circle(color, radius);
			}
			
			
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape shapes : list) {
			System.out.print(shapes.area());
		}
		
		
		
		
	}
	
}
