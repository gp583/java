import java.util.*;

public class Sudoku{	

//	Checks if num is an acceptable value for given row 
	public boolean checkRow( int r, int c ) {
	for( int col = 0; col < 9; col++ )
		if( board[r][c] == board )
			return false ;

	return true ;
   }
/*
	//Checks if num is an acceptable value for given column
	public boolean checkCol( int col, int num ) {
	for( int row = 0; row < 9; row++ )
		if( board[row][col] == num )
			return false ;

	return true ;
   }

	//Checks 3 * 3 boxes
	public boolean checkBox( int row, int col, int num ){
		row = (row / 3) * 3 ;
		col = (col / 3) * 3 ;

		for( int r = 0; r < 3; r++ )
			for( int c = 0; c < 3; c++ )
				if( board[row+r][col+c] == num )
					return false;
	
		return true;
   }
*/
//	}
   public static void main(String[] args){
		int r = 9;
		int c = 9;
		
	   int [][] board = 
			{{3,5,6,7,1,9,4,8,2},  //initialize array
			{1,7,8,4,2,3,9,6,5},
			{4,9,2,8,6,5,1,7,3},
		    {7,2,4,5,9,8,6,3,1},
		    {5,1,9,2,3,6,7,4,8},
		    {8,6,3,1,4,7,2,5,9},
		    {9,8,7,6,5,2,3,1,4},
		    {6,3,1,9,8,4,5,2,7},
		    {2,4,5,3,7,1,8,9,6}};
		
		
	   for (r=0; r < board.length; r++) {		   //prints array
		   int[] sub = board[r];
		   for (c = 0; c< sub.length; c++) {
			   System.out.print(sub[c] + " ");
		   }
		   System.out.println();
	   
		   

   }
}
}