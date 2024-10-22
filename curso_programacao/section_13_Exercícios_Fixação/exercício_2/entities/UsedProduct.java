package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override // Polymorphism
	public String priceTag() {
		return name + " (used) $ " + price + " (Manufacture date: " + manufactureDate + ")";
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}


	
	
}
