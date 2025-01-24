package entities;

import java.util.List;
import entities.Letters;

public class Player {
	
	private String name;
	private Letters letters;
	
	public Player(){
	}
	
	public Player(String name, Letters letters) {
		super();
		this.name = name;
		this.letters = letters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Letters getLetters() {
		return letters;
	}

	public void setLetters(Letters letters) {
		this.letters = letters;
	}
	
	
	
	
	
}
