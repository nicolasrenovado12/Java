package util;

import java.util.function.Predicate;

import entities.Product_2;

public class ProductPredicate implements Predicate<Product_2>{

	@Override
	public boolean test(Product_2 t) {
		return t.getPrice() >= 100;
	}

}
