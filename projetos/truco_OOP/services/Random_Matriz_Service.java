package services;

import java.util.Map;
import java.util.Random;

public class Random_Matriz_Service {

	public static void randomizerMap(Map<Integer, String> playerCards, Map<Integer, String> deck, Integer quantityOfPlayerCards) {	
		
		Random random = new Random();
		
		for(int i=0;i<quantityOfPlayerCards;i++) {
			
			int lengthMatrixRandomizer = deck.size();
	    	int randomInt = random.nextInt(lengthMatrixRandomizer); 
	    	
	    	playerCards.put(randomInt, deck.get(randomInt));
	    	
	    	
	    }
			
	}
}
