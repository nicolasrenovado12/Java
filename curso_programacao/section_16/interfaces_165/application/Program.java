package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data ");
		System.out.print("Car model:	");
		String modelCar = sc.nextLine();
		
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.println(start);
		System.out.println(finish);
		
		CarRental cr = new CarRental(start, finish, new Vehicle());
		
		System.out.print("Enter price per hour: ");
		Double hour = sc.nextDouble();
		System.out.print("\nEnter price per day: ");
		Double day = sc.nextDouble();
		
		
		
		
		
		System.out.println("INVOICE: ");
		System.out.print("Basic payment: ");
		System.out.print("tax: ");
		System.out.print("Total payment: ");
		
		
		
		
		sc.close();
	}
	
}
