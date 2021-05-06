package Game;

import java.util.Scanner;

public class TicTacToe {

	private char board[] = new char[10];
	private char player;

	// creating Method1
	private void creatingBoard() {
		// creating a board with number inside for choosing
		char position[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		player = 'X';
		for (int i = 1; i < 10; i++)
			board[i] = position[i];
	}

	// creating Method2
	public String currentBoard() {
		System.out.println("\n" + board[1] + "  | " + board[2] + "  | " + board[3]); // cell of 1st row
		System.out.println("" + board[4] + "  | " + board[5] + "  | " + board[6]); // cell of 2nd row
		System.out.println("" + board[7] + "  | " + board[8] + "  | " + board[9]); // cell of 3rd row
		return "showBoard";
	}

	// creating Method3
	public void ran() {
		System.out.println("Player Call for toss Type '0' for Head or '1' for Tail"); // calling for toss

		Scanner sc = new Scanner(System.in);
		int toss = sc.nextInt();     //getting call from player

		int check = (int) (Math.random() * 10) % 2; //getting head or tails randomly.

		if (check == toss) {
			System.out.println("Player got chance to move");
		} else
			System.out.println("Computer got chance to move");
	}

	// creating Method4
	public void play() {
		int spot;
		boolean posTaken = true; // calling the function
		while (posTaken) {
			// System.out.println( "position is taken, please enter a valid space");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			spot = in.nextInt();
			posTaken = checkPosn(spot);
			if (posTaken == false) // calling the function
				board[spot] = choosePlayer(); // move character to the selected position
		}
		currentBoard(); // display new board
	}

	// creating Method5
	public boolean checkPosn(int spot) {
		if (board[spot] == 'X' || board[spot] == 'O') { // checking the position is already taken or not.
			System.out.println("That position is already taken, please choose another");
			return true;
		} else {
			return false;
		}
	}

	private char choosePlayer() {
		// TODO Auto-generated method stub
		return player;
	}

	// creating Method6
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

	// Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
		TicTacToe game = new TicTacToe();
		game.creatingBoard(); // Calling method for the creating board.
		game.currentBoard(); // Calling method of current board.
		game.ran();
	}
}
