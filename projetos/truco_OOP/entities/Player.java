package entities;

import java.util.List;
import java.util.Map;

public class Player {
	
	private String name;
	private Map<Integer, String> cardsPlayer;
	
	public Player(){
	}
	
	public Player(String name, Map<Integer, String>  cardsPlayer) {
		super();
		this.name = name;
		this.cardsPlayer = cardsPlayer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getCardsPlayer() {
		return cardsPlayer;
	}

	public void setCardsPlayer(Map<Integer, String> cardsPlayer) {
		this.cardsPlayer = cardsPlayer;
	}

	
	
	
	
	
	
}
