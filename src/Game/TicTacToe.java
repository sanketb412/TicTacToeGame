package Game;

import java.util.Scanner;

public class TicTacToe {

	// creating Method1
	private char[][] creatingBoard() {
		@SuppressWarnings("unused")
		// creating a board for empty
		char board[][] = new char[3][3];
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				board[i][j] = ' ';
				System.out.println("| " + board[i][j] + "| " + board[i][j] + "| " + board[i][j] + "| ");
			}
		}
		return board;
	}

	// creating Method2
	public void input() {
		// Choosing X or O for Player
		System.out.println("Choose 'X' or 'O' ");
		Scanner sc = new Scanner(System.in);
		String letterPerson = sc.nextLine(); // getting input from player
		System.out.println("Player Mark: " + letterPerson);
		int letterComputer = (int) (Math.random() * 10) % 2; // getting random X or O from Computer
		switch (letterComputer) {
		case 0:
			System.out.println("\nComputer Mark: O ");
			break;
		case 1:
			System.out.println("\nComputer Mark: X");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
		TicTacToe game = new TicTacToe();
		game.creatingBoard(); // Calling method for the creating board
		game.input(); // Calling method for knowing the input
	}

}
