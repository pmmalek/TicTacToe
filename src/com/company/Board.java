package com.company;

public class Board {
//    char[][] board = new char[3][3];
    public final int MAX_WIDTH=3;
    public final int MAX_HEIGHT=3;
    char[][] board = new char[MAX_WIDTH][MAX_HEIGHT];

    public Board() {
        for (char[] row:board) {
            for (char element:row) {
                element = 'p';
            }

        }
    }

    public void printBoard() {

        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';

            }
        }*/

        for (char[] row :board) {
            for (char element :row) {
                System.out.print(element);
            }

        }


    }

    public boolean setPosition(int row, int column, char playerSignature){
        if ((row<0 || row>MAX_WIDTH - 1) || (column<0 || column>MAX_HEIGHT)){
            throw new IndexOutOfBoundsException();
        }else if (board[row][column]=='-'){
            board [row][column]= playerSignature;
            return  true;
        } else {
            return  false;
        }


    }
}
