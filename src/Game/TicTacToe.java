package Game;

import java.util.Scanner;

public class TicTacToe {

	private char[][] creatingBoard() {
		@SuppressWarnings("unused")
		//creating a board for empty
		char board[][] =  new char[3][3];
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				board[i][j]=' ';
				System.out.println("| " +board[i][j] + "| " +board[i][j] + "| " +board[i][j] +"| ");
			}
		}
		return board;
	}
	
	public void input() {
		System.out.println("Choose 'X' or 'O' ");
		Scanner sc = new Scanner(System.in);
		String letterPerson = sc.nextLine();
		System.out.println("Player Mark: "  +letterPerson);
		int letterComputer = (int) (Math.random() * 10) % 2;
		switch (letterComputer) {
		case 0:
			System.out.println("\nComputer Mark: O ");break;
		case 1:
			System.out.println("\nComputer Mark: X" );break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
		TicTacToe game = new TicTacToe();
		game.creatingBoard();
		game.input();
	}

}
