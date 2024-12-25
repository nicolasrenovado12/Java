package entities;

import java.util.Objects;

public class Product2 implements Comparable<Product2> {

	private String name;
	private Double price;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product2(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}


	public int compareTo(Product2 other) {
		return price.compareTo(other.getPrice());
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product2 other = (Product2) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
	
	
	
}
