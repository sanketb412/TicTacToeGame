package Game;

import java.util.Scanner;

public class TicTacToe {

	private char board[] = new char[10];
	private char player;
	private char computer;

	private char[] creatingBoard() {
		System.out.println("\nCreated Board");
		@SuppressWarnings("unused")
		// creating a board for empty
		char board[] = new char[4];
		for (int i = 1; i < 4; i++) {
			board[i] = ' ';
			System.out.println("|  " + board[i] + "|  " + board[i] + "|  " + board[i] + "|");
		}
		return board;
	}

	// creating Method1
	private void showBoard() {
		// creating a board with number inside for choosing
		char position[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		player = 'X';
		computer = 'O';
		for (int i = 1; i < 10; i++)
			board[i] = position[i];
	}

	// creating Method2
	private String currentBoard() {
		System.out.println("\nShowing Board with Specifing cell number");
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |"); // cell of 1st row
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");// cell of 2nd row
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |"); // cell of 3rd row
		return "currentBoard";
	}

	// creating Method3
	private void User() {
		int spot;
		char blank = ' ';
		System.out.println("\nPlayer Call for toss Type '0' for Head or '1' for Tail"); // calling for toss

		Scanner sc = new Scanner(System.in);
		int toss = sc.nextInt(); // getting call from player

		int check = (int) (Math.random() * 10) % 2; // getting head or tails randomly.
		alternatePlay();
		do {
		if (check == toss) {
			System.out.println("\t###..Player got chance to move..###");
			System.out.println("\nChoose the location to move");
			boolean posTaken = true; // calling the function
			while (posTaken) {
				Scanner in = new Scanner(System.in);
				spot = in.nextInt();
				posTaken = checkPosn(spot);
				if (posTaken == false) // calling the function
					board[spot] = choosePlayer(); // move character to the selected position
				currentBoard(); // display new board
			}
		} else {
			System.out.println("\t###..Computer got chance to move..###");
		}
		}while ( checkWinner() == blank );        
    }

	public char checkWinner() {
		char Winner = ' ';

		// Check if X wins
		if (board[1] == 'X' && board[2] == 'X' && board[3] == 'X')
			Winner = 'X';
		if (board[4] == 'X' && board[5] == 'X' && board[6] == 'X')
			Winner = 'X';
		if (board[7] == 'X' && board[8] == 'X' && board[9] == 'X')
			Winner = 'X';
		if (board[1] == 'X' && board[4] == 'X' && board[7] == 'X')
			Winner = 'X';
		if (board[2] == 'X' && board[5] == 'X' && board[8] == 'X')
			Winner = 'X';
		if (board[3] == 'X' && board[6] == 'X' && board[9] == 'X')
			Winner = 'X';
		if (board[1] == 'X' && board[5] == 'X' && board[9] == 'X')
			Winner = 'X';
		if (board[3] == 'X' && board[5] == 'X' && board[7] == 'X')
			Winner = 'X';
		if (Winner == 'X') {
			System.out.println("Player wins the game.");
		}
		for (int i = 1; i < 10; i++) {
			if (board[i] == 'X' || board[i] == 'O') {
				if (i == 9) {
					char Draw = 'D';
					System.out.println(" Game is stalemate ");
					return Draw;
				}
				continue;
			} else
				break;
		}
		return Winner;
	}

	// creating Method4
	private boolean checkPosn(int spot) {
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

	private void alternatePlay() {
		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
	}

	// creating Method5
	private void chossingLetter() {
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
		game.showBoard();
		game.currentBoard(); // Calling method of current board.
		game.User();
	}
}
