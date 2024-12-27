package util;

import java.util.function.Function;

import entities.Product_4;

public class UpperCaseName implements Function<Product_4, String>{

	@Override
	public String apply(Product_4 p) {
		return p.getName().toUpperCase();
	}

}
