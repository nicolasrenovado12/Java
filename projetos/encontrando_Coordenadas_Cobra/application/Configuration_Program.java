package application;

import java.util.ArrayList;

public class Configuration_Program {

	public static void main(String[] args) {
		ArrayList<String> grid = new ArrayList<String>();
		
		grid.add(">>v");
		grid.add("^h<");
		grid.add("^<<");
		
		System.out.println(Program_Find_Snake.findSnakeOnGrid(grid));
	}
	
}
