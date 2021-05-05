package Game;

import java.util.Scanner;

public class TicTacToe {

	// creating Method1
	private char[][] creatingBoard() {
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
	public void ChossingLetter() {
		// Choosing X or O for Player
		System.out.println("Choose 'X' or 'O' ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char letterPerson = sc.next().charAt(0); // getting input from player

		if (letterPerson == 'X') {
			System.out.println("Player Mark: 'X' ");
			System.out.println("\nComputer Mark: 'O' ");
		} else {
			System.out.println("Player Mark: 'O' ");
			System.out.println("\nComputer Mark: 'X' ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
		TicTacToe game = new TicTacToe();
		game.creatingBoard(); // Calling method for the creating board
		game.ChossingLetter(); // Calling method for knowing the input
	}

}
