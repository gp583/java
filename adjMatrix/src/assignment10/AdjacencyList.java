/*
 * Guilio Piccinonna
 * Assignment 10
 * AdjacencyList.java
 * 
 */

package assignment10;

public class AdjacencyList {

	private int numNodes;
	private char [] letters;
	private AdjacencyNode [] nodes;

	/** Creates a new instance of AdjacencyList */
	public AdjacencyList(int s) {
		numNodes = s;
		letters = new char[s];
		nodes = new AdjacencyNode[s];
	}

	public AdjacencyList(int s, char [] l) {
		numNodes = s;
		letters = l;
		nodes = new AdjacencyNode[s];
	}

	public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	public char[] getLetters() {
		return letters;
	}

	public void setLetters(char[] letters) {
		this.letters = letters;
	}

	public AdjacencyNode[] getNodes() {
		return nodes;

	}

	public void setNodes(AdjacencyNode[] nodes) {
		this.nodes = nodes;
	}

	private int getLocation(char letter) {
		for (int i = 0; i < letters.length; i++)
			if (letters[i] == letter)
				return i;
		return -1;
	}

	public int checkInDegree(int columnNum) {

		AdjacencyMatrix mat = this.convertToMatrix();

		int counter = 0;

		for (int i = 0; i < mat.getNumNodes(); i++){
			if (mat.getMatrix()[columnNum][i] == 1)
				counter++;
		}
		return counter;
	}

	public int checkOutDegree(int rowNum) {

		AdjacencyMatrix mat = this.convertToMatrix();

		int counter = 0;

		for (int i = 0; i < mat.getNumNodes(); i++){
			if (mat.getMatrix()[i][rowNum] == 1)
				counter++;
		}
		return counter;
	}

	public AdjacencyMatrix convertToMatrix() {
		AdjacencyMatrix matrix = new AdjacencyMatrix(numNodes, letters);	
		AdjacencyNode temp;

		for(int i = 0; i < numNodes; i++){
			temp = nodes[i].getLink();
			while (temp != null){
				matrix.getWeights()[i][getLocation(temp.getNodeValue())] = temp.getWeight();
				matrix.getMatrix()[i][getLocation(temp.getNodeValue())] = 1;
				temp = temp.getLink();
			}
		}
		return matrix;
	}
}



