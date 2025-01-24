package entities;

import java.util.Map;

public class Letters {

    private Map<Integer, String> ranks;
    private Map<Integer, String> suits;

    public Letters() {    	
    }

	public Letters(Map<Integer, String> ranks, Map<Integer, String> suits) {
		super();
		this.ranks = ranks;
		this.suits = suits;
	}

	public Map<Integer, String> getRanks() {
		return ranks;
	}

	public void setRanks(Map<Integer, String> ranks) {
		this.ranks = ranks;
	}

	public Map<Integer, String> getSuits() {
		return suits;
	}

	public void setSuits(Map<Integer, String> suits) {
		this.suits = suits;
	}
    
    
}

