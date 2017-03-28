/*
 * Guilio Piccinonna
 * Assignment 10
 * AdjacencyMatrix.java
 * 
 */

package assignment10;

public class AdjacencyMatrix {

	private int numNodes;
	private int[][] matrix;
	private int[][] weights;
	private char[] nodeNames;

	/** Creates a new instance of AdjacencyMatrix */
	public AdjacencyMatrix(int n, char [] names) {
		numNodes = n;
		matrix = new int[n][n];
		weights = new int[n][n];
		nodeNames = names;
	}
	public AdjacencyMatrix(int n, char [] names, int [][] m, int [][] w) {
		numNodes = n;
		matrix = m;
		weights = w;
		nodeNames = names;
	}

	public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int[][] getWeights() {
		return weights;
	}

	public void setWeights(int[][] weights) {
		this.weights = weights;
	}

	public char[] getNodeNames() {
		return nodeNames;
	}

	public void setNodeNames(char[] nodeNames) {
		this.nodeNames = nodeNames;
	}


	public static String setW(int x, int size) {
		String ans = "";
		String ans2 = "" + x;
		for (int i = 0; i < size - ans2.length(); i++)
			ans = ans + " ";
		ans = ans + ans2;
		return ans;
	}

	public String printMatrix(int [][] temp) {
		int i, j;
		String s = "";

		for (i = 0; i < getNumNodes(); i++)
		{
			for (j = 0; j < getNumNodes(); j++)
				s += setW(temp[i][j],5);    // have each value of the matrix take 5 spaces
			s += "\n";
		}
		return s;
	}

	public AdjacencyList convertToList() {
		AdjacencyNode temp;
		AdjacencyNode node1;
		AdjacencyNode node[] = new AdjacencyNode[numNodes];
		AdjacencyList list = new AdjacencyList(numNodes, nodeNames);

		for (int i = 0; i < numNodes; i++){
			node[i] = new AdjacencyNode(nodeNames[i], 0);
			temp = node[i];
			for (int j = 0; j < numNodes; j++){
				if (this.matrix[i][j] > 0){
					node1 = new AdjacencyNode(nodeNames[j], this.weights[i][j]);
					temp.setLink(node1);
					temp = temp.getLink();
				}
			}
		}
		list.setNodes(node);
		return list;
	}

	public int checkInDegree(int columnNum, AdjacencyMatrix mat) {
		int counter = 0;

		for (int i = 0; i < mat.numNodes; i++){
			if (mat.matrix[columnNum][i] == 1)
				counter++;
		}
		return counter;
	}

	public int checkOutDegree(int rowNum, AdjacencyMatrix mat) {
		int counter = 0;

		for (int i = 0; i < mat.numNodes; i++){
			if (mat.matrix[i][rowNum] == 1)
				counter++;
		}
		return counter;
	}

	public boolean checkDirected() {

		for (int j = 0; j < this.numNodes-1; j++){
			for (int i = j+1; i < this.numNodes; i++){
				if (this.matrix[j][i] != this.matrix[i][j])
					return true;
			}
		}
		return false;
	}

	public String toString() {
		String answer = "The number of nodes is " + getNumNodes() + "\n\n";

		answer += "The adjacency Matrix is:\n";
		answer += printMatrix(getMatrix());
		answer += "\nThe matrix of weights is:\n";
		answer += printMatrix(getWeights());

		return answer;
	}
}

