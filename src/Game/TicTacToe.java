package Game;

import java.util.Scanner;

public class TicTacToe {

	private char board[] = new char[10];

	// creating Method1
	private void creatingBoard() {
		// creating a board with number inside for choosing
		char position[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 1; i < 10; i++)
			board[i] = position[i];
	}

	// creating Method2
	public String showBoard() {
		System.out.println("\n" + board[1] + "  | " + board[2] + "  | " + board[3]); // cell of 1st row
		System.out.println("" + board[4] + "  | " + board[5] + "  | " + board[6]); // cell of 2nd row
		System.out.println("" + board[7] + "  | " + board[8] + "  | " + board[9]); // cell of 3rd row
		return "currentBoard";
	}

	// creating Method3
	public void chossingLetter() {
		// Choosing X or O for Player
		System.out.println("\nChoose 'X' or 'O' ");
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
		game.creatingBoard(); // Calling method for the creating board.
		game.showBoard(); // Calling method of current board.
		game.chossingLetter(); // Calling method for knowing the input.
	}
}
