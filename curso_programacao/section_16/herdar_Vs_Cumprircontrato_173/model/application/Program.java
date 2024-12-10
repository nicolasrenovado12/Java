package model.application;

import model.enums.Color;
import model.entities.*;
public class Program {

	public static void main(String[] args) {
		
		Shape circle = new Circle(Color.WHITE, 5.3);
		Shape rectangle = new Rectangle(Color.BLACK, 5.3, 3.3);
		System.out.println("This is a area of circle: " + circle.area() + ". And this is a color of this circle: " + circle.getColor());
		System.out.println("This is a area of rectangle: " + rectangle.area() + ". And this is a color of this rectangle: " + rectangle.getColor());
		
		
	}


}
