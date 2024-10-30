package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program_147 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.print("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println(reservation.toString());
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			String checkInString = sc.next();
			checkIn = sdf.parse(checkInString);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			String checkOutString = sc.next();
			checkOut = sdf.parse(checkOutString);
			
			

			String error = reservation.updateDates(checkIn, checkOut);
			
			if (error != null) {
				System.out.print(error);
				
			} else {
				System.out.print(reservation.toString());
			}
				
					
			
			
		}
		

		sc.close();

	}

}