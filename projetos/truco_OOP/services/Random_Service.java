package services;

import java.util.Map;
import java.util.Random;

public class Random_Service {

	public static void randomizerMap(Map<Integer, String> cards, Map<Integer, String> deck, Integer quantityOfPlayerCards) {	
		
		Random random = new Random();
		
		while(cards.size() != quantityOfPlayerCards) {
			
			int lengthMatrixRandomizer = deck.size();
	    	int randomInt = random.nextInt(lengthMatrixRandomizer); 
	    	
	    	cards.put(randomInt, deck.get(randomInt));
			
		}
			
	}
}
