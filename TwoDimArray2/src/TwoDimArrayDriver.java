
public class TwoDimArrayDriver {

	public static void main(String[] args) {
		int [][] board = {{1,2,3,4,5},{6,7,8,9,10},{23,43,34,56,82},{52,15,21,14,42}};
		int [][] board2 = {{1,2,35},{8,9,10},{34,56,82},{52,15,17},{21,25,38},{41,123,11}} ;
		System.out.println("This is a " + board.length + " by " + board[0].length + " array");
		TwoDimArray2 ray1 = new TwoDimArray2(board);
		TwoDimArray2 ray2 = new TwoDimArray2(board);
		
		ray1.printRow(2);
		ray1.printColumn(1);
		ray1.printArray();
		
		ray2.printRow(2);
		ray2.printColumn(1);
		ray2.printArray();

	}

}
