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
				System.out.println("| " +board[i][j] + "| " +board[i][j] + "| " +board[i][j]  + "| ");
			}
		}
		return board;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..###..Welcome to Tic-Tac-Toe game..###..");
		TicTacToe game = new TicTacToe();
		game.creatingBoard();

	}

}
