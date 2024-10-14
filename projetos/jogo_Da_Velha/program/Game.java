package program;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] board = { { "0", "1", "2" }, { "3", "4", "5" }, { "6", "7", "8" } };

		String p2;
		System.out.print("Player 1: x or o? ");
		String p1 = sc.nextLine();
		if (p1.equals("x")) {
			p2 = "o";
		} else {
			p2 = "x";
		}
		System.out.println("Ok, player 1 = " + p1 + " and player 2 = " + p2);

		int b = 0;

		while (b == 0) {
			System.out.println(b);
			System.out.print(display(board));

			System.out.println("Player 1's turn: ");

			System.out.print("Which number? ");
			int number = sc.nextInt();

			scan1(board, p1, number);
			b += checkwinning(board, p1, p2);

			if (b == 1) {
				break;
			}

			System.out.print(display(board));

			System.out.println("Player 2's turn: ");

			System.out.print("Which number? ");
			int number2 = sc.nextInt();

			scan2(board, p2, number2);
			b += checkwinning(board, p1, p2);

			if (number == number2) {
				System.out.println("This is not possible.");
				break;
			}
		}
		sc.close();
		if (b == 1) {
			System.out.print(display(board));
			System.out.println("Player 1 venceu!");
		} else {
			System.out.print(display(board));

			System.out.println("Player 2 venceu!");
		}
	}

	public static String display(String[][] board) {
		String a = "";
		for (int e = 0; e < board.length; e++) {
			for (int i = 0; i < board[e].length; i++) {
				a += "|" + board[e][i] + "|";
			}
			a += "\n";
		}
		return a;
	}

	public static void scan1(String[][] board, String p1, int number) {
		for (int e = 0; e < board.length; e++) {
			for (int i = 0; i < board[e].length; i++) {
				if (board[e][i].equals(String.valueOf(number))) {
					board[e][i] = p1;
					break;
				}
			}
		}
	}

	public static void scan2(String[][] board, String p2, int number2) {
		for (int e = 0; e < board.length; e++) {
			for (int i = 0; i < board[e].length; i++) {
				if (board[e][i].equals(String.valueOf(number2))) {
					board[e][i] = p2;
					break;
				}
			}
		}
	}

	public static int checkwinning(String[][] board, String p1, String p2) {
		for (int i = 0; i < 3; i++) {

			// Check Columns
			if (board[0][i].equals(p1) && board[1][i].equals(p1) && board[2][i].equals(p1)) {
				return 1;
			}
			if (board[0][i].equals(p2) && board[1][i].equals(p2) && board[2][i].equals(p2)) {
				return 2;
			}
			// Check rows
			if (board[i][0].equals(p1) && board[i][1].equals(p1) && board[i][2].equals(p1)) {
				return 1;
			}
			if (board[i][0].equals(p2) && board[i][1].equals(p2) && board[i][2].equals(p2)) {
				return 2;
			}
			// Check diagonals
			if (board[0][0].equals(p1) && board[1][1].equals(p1) && board[2][2].equals(p1)) {
				return 1;
			}
			if (board[0][0].equals(p2) && board[1][1].equals(p2) && board[2][2].equals(p2)) {
				return 2;
			}
			if (board[0][2].equals(p1) && board[1][1].equals(p1) && board[2][0].equals(p1)) {
				return 1;
			}
			if (board[0][2].equals(p2) && board[1][1].equals(p2) && board[2][0].equals(p2)) {
				return 2;
			}

		}
		return 0;

	}
}
