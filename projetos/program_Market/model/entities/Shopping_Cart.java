package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Shopping_Cart {

	private List<String> productsOnCart = new ArrayList<String>();
	private int price = 0;

	public void addCart(String productOfUser) {
		productsOnCart.add(productOfUser);

	}

	public void calculatePrice(String productOfUser, int i, Double[] productsPrice) {
		price += productsPrice[i];
	}

	@Override
	public String toString() {
		return "Shopping_Cart [productsOnCart=" + productsOnCart + ", price=" + price + "]";
	}

}
