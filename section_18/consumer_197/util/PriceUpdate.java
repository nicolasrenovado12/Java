package util;

import java.util.function.Consumer;

import entities.Product_3;

public class PriceUpdate  implements Consumer<Product_3>{

	@Override
	public void accept(Product_3 p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
