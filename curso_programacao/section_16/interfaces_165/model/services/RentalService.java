package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
 	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
 	
 	public void processInvoice(CarRental carRental) {
 		double basicPayment;
 		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
 		double hours = minutes / 60.0;
 		double realHours = Math.round(hours);
 		if (realHours <= 12.0) {
 			basicPayment = pricePerHour * realHours;
 		} else {
 			int days = 1;
 			days += Math.round(realHours / 24);
 			basicPayment = pricePerDay * days;
 			
 		}
 		
 		Double tax = taxService.tax(basicPayment);
 		
 		
 		carRental.setInvoice(new Invoice(basicPayment, tax));
 	}
	
	
}
