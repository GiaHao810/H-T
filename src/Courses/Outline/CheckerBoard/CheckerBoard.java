package Courses.Outline.CheckerBoard;

import java.util.Scanner;

public class CheckerBoard {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        String board[][] = new String[row][column];
        printBoard(board, row, column);
        setMove(board);
    }

    static void printBoard(String board[][], int row, int column){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("|" + board[i][j]);
            }
            System.out.print("\n-----------\n");
        }
    }

    static void setMove(String board[][]){
        int playerMove = input.nextInt();

        switch (playerMove) {
            case 1:
                if(checkValid(board, playerMove)){
                    board[0][0] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 2:
                if(checkValid(board, playerMove)){
                    board[0][1] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 3:
                if(checkValid(board, playerMove)){
                    board[0][2] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 4:
                if(checkValid(board, playerMove)){
                    board[1][0] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 5:
                if(checkValid(board, playerMove)){
                    board[1][1] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 6:
                if(checkValid(board, playerMove)){
                    board[1][2] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 7:
                if(checkValid(board, playerMove)){
                    board[2][0] = "O";   
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 8:
                if(checkValid(board, playerMove)){
                    board[2][1] = "O";
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            case 9:
                if(checkValid(board, playerMove)){
                    board[2][2] = "O";   
                } else {
                    System.out.println("Invalid move!");
                }
                break;
            default:
                System.out.println("Invalid move! Try again.");
                break;
        }
    }

    static boolean checkValid(String board[][], int playerMove){
        int i = 0;
        int j = 0;

        if(playerMove == 1){
            i = 0;
            j = 0;
        }
        if(playerMove == 2){
            i = 0;
            j = 1;
        }
        if(playerMove == 3){
            i = 0;
            j = 2;
        }
        if(playerMove == 4){
            i = 1;
            j = 0;
        }
        if(playerMove == 5){
            i = 1;
            j = 1;
        }
        if(playerMove == 6){
            i = 1;
            j = 2;
        }
        if(playerMove == 7){
            i = 2;
            j = 0;
        }
        if(playerMove == 8){
            i = 2;
            j = 1;
        }
        if(playerMove == 9){
            i = 2;
            j = 2;
        }
        
        if(board[i][j] == "O" || board[i][j] == "X"){
            return false;
        } else {
            return true;
        }
    }
}
