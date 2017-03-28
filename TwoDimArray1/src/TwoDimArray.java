
public class TwoDimArray {

	public static void main(String[] args) {
		int [][] board = {{1,2,3,4,5},{6,7,8,9,10},{23,43,34,56,82},{52,15,21,14,42}};
		int [][] board2 = {{1,2,35},{8,9,10},{34,56,82},{52,15,17},{21,25,38},{41,123,11}} ;
		System.out.println("This is a " + board.length + " by " + board[0].length + " array");
		
		printRow(board, 2);
		printColumn(board, 1);
		printArray(board);
		
		printRow(board2, 2);
		printColumn(board2, 1);
		printArray(board2);
	}
	
	public static void printRow(int [][] theArray,int row){
		for (int i = 0; i < theArray[0].length; i++)
			System.out.print(theArray[row][i] + " ");
		System.out.println();	
	}

	public static void printColumn(int [][] theArray,int col){
		for (int i = 0; i < theArray.length; i++)
			System.out.print(theArray[i][col] + " ");
		System.out.println();	
	}
	
	public static void printArray(int [][] theArray){
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[0].length; j++)
				System.out.print(theArray[i][j] + " ");
			System.out.println();
		}
	}

}
