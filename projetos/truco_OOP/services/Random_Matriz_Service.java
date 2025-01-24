package services;

import java.util.Map;
import java.util.Random;

public class Random_Matriz_Service {

	public static void randomizerMap(Map<Integer, String> matrixString, Map<Integer, String> ranks) {
		
		Random random = new Random();
		
		for(int i=0;i<matrixString.size();i++) {
			
			int lengthMatrixRandomizer = ranks.size();
	    	int randomInt = random.nextInt(lengthMatrixRandomizer); 
	    	
	    	matrixString.put(randomInt, ranks.get(randomInt));
	    	
	    	
	    }
			
	}
}
