package entities;

import java.util.function.Predicate;

public class Teste {

	public static int quero(int a, Predicate<Integer> criteria) {
		
		if (criteria.test(a)) {
			return 3;
		}
		return 1;
		
	}
	
}
