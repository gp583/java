
public class TwoDimArray2 {
	private int [][] board;
	private int numRows;
	private int numCols;
	private int i;
	private int j;
	
	public TwoDimArray2(int [][] theArray) {
		board = theArray;
		numRows = board.length;
		numCols = board[0].length;
	}
	
	public void printRow(int row){
		for (i = 0; i < numCols; i++)
			System.out.print(board[row][i] + " ");
		System.out.println();	
	}

	public void printColumn(int col){
		for (i = 0; i < numRows; i++)
			System.out.print(board[i][col] + " ");
		System.out.println();	
	}
	
	public void printArray(){
		for (i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
}
