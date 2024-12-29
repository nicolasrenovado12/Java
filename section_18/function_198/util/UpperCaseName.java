package util;

import java.util.function.Function;

import entities.Product_5;

public class UpperCaseName implements Function<Product_5, String>{

	@Override
	public String apply(Product_5 p) {
		return p.getName().toUpperCase();
	}

}
