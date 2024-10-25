package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {

	private LocalDate manufactureDate;
	
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override // Polymorphism
	public String priceTag() {
		return name + " (used) $ " + price + " (Manufacture date: " + manufactureDate + ")";
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}


	
	
}
