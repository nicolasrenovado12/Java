package entities;

public class Product_3 {
	
	private String name;
	private Double price;

	public Product_3(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

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

	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return "Product_3 [name=" + name + ", price=" + price + "]";
	}
}
