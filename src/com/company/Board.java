package com.company;

public class Board {

    public Board() {
        char[][] board = new char[3][3];
    }

    public static void printBoard(Board board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';

            }
        }

    }
}
