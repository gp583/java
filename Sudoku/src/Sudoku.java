//Guilio Piccinonna
//10-23-14
//Sudoku Checker

import java.util.*;

public class Sudoku{
	private int [][] board;

	Sudoku(int [][] x){
		board = x;
	}

	public boolean checkSudoku() {

		for (int i = 0; i < 9; i++) {
			if (!checkRow(i)){
				System.out.println("bad row found at " + i);
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (!checkCol(i)){
				System.out.println("bad column found at " + i);
				return false;
			}
		}

		for (int i = 0; i <= 6; i += 3) {
			for (int j = 0; j <= 6; j += 3) {
				if (!checkSub(i, j)){
					System.out.println("bad subsquare found at " + i + ", " + j);
					return false;
				}
			}
		}
		return true;
	}

	public boolean checkRow(int s){

		boolean [] check = new boolean[10];
		int stored;

		for (int i=0;i<10;i++){
			check[i] = false;
		}
		for (int i=0;i<9;i++){
			stored = board[s][i];
			check[stored] = true;
		}
		for (int i=1;i<10;i++){
			if (check[i] == false)
				return false;
		}
		return true;
	}

	public boolean checkCol(int s){

		int stored, i;

		boolean [] check = new boolean[10];
		for (i=0;i<10;i++){
			check[i]=false;
		}
		for (i=0;i<9;i++){
			stored = board[i][s];
			check[stored] = true;
		}
		for (i=1;i<10;i++)
			if (check[i] == false)
				return false;

		return true;
	}

	public boolean checkSub(int r, int c){

		int stored, i, j;

		boolean [] check = new boolean[10];

		for (i=0;i<10;i++){
			check[i]=false;
		}
		for (i=r;i<r+3;i++){
			for (j=c;j<c+3;j++){
				stored = board[i][j];
				check[stored] = true;

			}
		}
		for (i=1;i<10;i++)
			if (check[i] == false)
				return false;

		return true;
	}

	public static void main(String[] args) {	

		int [][]board1 = 
			{{3,5,6,7,1,9,4,8,2},
				{1,7,8,4,2,3,9,6,5},
				{4,9,2,8,6,5,1,7,3},
				{7,2,4,5,9,8,6,3,1},
				{5,1,9,2,3,6,7,4,8},
				{8,6,3,1,4,7,2,5,9},
				{9,8,7,6,5,2,3,1,4},
				{6,3,1,9,8,4,5,2,7},
				{2,4,5,3,7,1,8,9,6}};

		int [][]board2 = 
			{{3,1,7,7,5,8,9,6,2},
				{5,7,9,2,1,6,8,3,4},
				{6,8,2,4,9,3,7,1,5},
				{7,4,8,5,2,1,6,9,3},
				{1,2,6,9,3,4,5,8,7},
				{9,3,5,8,6,7,2,4,1},
				{4,9,1,6,4,2,3,5,8},
				{8,6,4,3,7,5,1,2,9},
				{2,5,3,1,8,9,4,7,6}};

		Sudoku Sudoku1 = new Sudoku(board1);

		Sudoku Sudoku2 = new Sudoku(board2);

		System.out.println(Sudoku1.checkSudoku());
		System.out.println(Sudoku2.checkSudoku());
	}
}

/* 
true
bad row found at 0
false
 */