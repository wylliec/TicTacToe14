package org.booth.adv.tictactoe14;

import java.util.Arrays;

public class TicTacToeManager {
    private ToeTreeNode root;
    private ToeTreeNode subtree;
    int[][] board;
    boolean xTurn;
    boolean gameOver;
    
    public TicTacToeManager() {
        root = null;
        subtree = root;
        board = new int[3][3];
        xTurn = true;
        gameOver = false;
    }
    
    public void play(int x, int y) {
        int pos = x + (y - 1) * 3;
        int xo = xTurn ? -1 : 1;
        board[x-1][y-1] = xo;
        
        xTurn = !xTurn;
    }
    
    public void reset() {
        subtree = root;
    }
    
    public boolean isXTurn() {
        return xTurn;
    }
    
    public boolean isGameOver() {
        return gameOver;
    }
    
    public String toString(){
        String str = "";
        for(int i = 0; i < board.length; i++)
        {
           for(int j = 0; j < board[i].length; j++)
           {
              char toPrint = ' ';
              if(board[i][j] > 0){
                  toPrint = 'x';
              }
              if(board[i][j] < 0){
                  toPrint = 'o';
              }
              str += toPrint;
           }
           str += "\n";
        }
        return str;
    }
}
