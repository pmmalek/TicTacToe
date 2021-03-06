package com.company;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();

        Scanner in = new Scanner(System.in);

        Player player1 = new PlayerBuilder().board(board).name("Tolek").build();

    }


    private static void printWinner(String winner) {
        if (winner.equals("Tie")) {
            System.out.println("It's a tie!");
        } else {
            System.out.println(winner + " won!");
        }

    }

    private static String playGame(Board board) {
        Player playerX = new Player("X", board);
        Player playerO = new Player("O", board);

        Scanner in = new Scanner(System.in);

        Player currPlayer;
        int turnCount = 0;
        int play;
        boolean hasWon = false;
        String winner = "Tie";

        boolean keepPlaying = true;
        while (keepPlaying) {
            board.printBoard();
        }
        turnCount++;

        if (turnCount % 2 == 0) {
            currPlayer = playerO;
        } else {
            currPlayer = playerX;
        }
        System.out.println(currPlayer.getName() + ", make a move (1-9): ");
        play = in.nextInt();

//            hasWon = currPlayer.makePlay(Player.cells[play - 1]);

        if (hasWon) {
            winner = currPlayer.getName();
            keepPlaying = false;
        }
        if (turnCount == 9) {
            keepPlaying = false;

            return winner;
        }
        return winner;
    }

}