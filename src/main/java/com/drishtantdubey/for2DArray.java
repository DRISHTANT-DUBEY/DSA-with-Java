package com.drishtantdubey;

import java.util.Arrays;
import java.util.Scanner;

public class for2DArray {
    public static void main(String[]  args){
        char[][] current_board = createBoard();
        for(int a=0; a <= 9; a++) {
            int[] choose_Array = chooseCell();
            current_board = inputBoard(choose_Array);
            System.out.println(Arrays.deepToString(current_board));
        }
    }
    public static char[][] createBoard(){
        char[][] board = new char[3][3] ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                board[i][j] = '-';
            }
        }
        return (board);
    }

    public static char[][] inputBoard(int[] set_i_j_v){
        char[][] board = new char[3][3];
        int set_i = (set_i_j_v[0]);
        int set_j = (set_i_j_v[1]);
        int set_v = (set_i_j_v[2]);
        char value;
        switch (set_v) {
            case 1:
                value='X';
                break;
            case 2:
                value='O';
                break;
            default:
                value='-';
        };
        board[set_i][set_j] = value;
        return (board);
    }
    public static int[] chooseCell(){
        Scanner scanner = new Scanner(System.in);
        int[] setter_i_j_v = new int[3];
        System.out.println("Your blocks are:\n 1.First\n 2.Second\n 3.Third\n 4.Fourth\n 5.Fifth\n 6.Sixth\n 7.Seventh\n 8.Eight\n 9.Ninth");
        System.out.println("Enter Your Array Type Index as Given Above:");
        int block = scanner.nextInt();
        System.out.println("Enter Either A 1 for X or 0 for O:");
        int value = scanner.nextInt();

        switch (block) {
            case 1:
                setter_i_j_v[0] = 0;
                setter_i_j_v[1] = 0;
                setter_i_j_v[2] = value;
                break;
            case 2:
                setter_i_j_v[0] = 0;
                setter_i_j_v[1] = 1;
                setter_i_j_v[2] = value;
                break;
            case 3:
                setter_i_j_v[0] = 0;
                setter_i_j_v[1] = 2;
                setter_i_j_v[2] = value;
                break;
            case 4:
                setter_i_j_v[0] = 1;
                setter_i_j_v[1] = 0;
                setter_i_j_v[2] = value;
                break;
            case 5:
                setter_i_j_v[0] = 1;
                setter_i_j_v[1] = 1;
                setter_i_j_v[2] = value;
                break;
            case 6:
                setter_i_j_v[0] = 1;
                setter_i_j_v[1] = 2;
                setter_i_j_v[2] = value;
                break;
            case 7:
                setter_i_j_v[0] = 2;
                setter_i_j_v[1] = 0;
                setter_i_j_v[2] = value;
                break;
            case 8:
                setter_i_j_v[0] = 2;
                setter_i_j_v[1] = 1;
                setter_i_j_v[2] = value;
                break;
            case 9:
                setter_i_j_v[0] = 2;
                setter_i_j_v[1] = 2;
                setter_i_j_v[2] = value;
                break;
            default:
                System.out.println("Enter A correct Value");
                chooseCell();

        }

        return(setter_i_j_v);
    }

}
