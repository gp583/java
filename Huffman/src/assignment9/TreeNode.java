//Guilio Piccinonna
//Assignment 9

package assignment9;

public class TreeNode implements Comparable {

	private Huffman storedObj;	
	private TreeNode left;		
	private TreeNode right;		


	public TreeNode() {
		setStoredObj(null);
		setLeft(null);
		setRight(null);
	}

	public TreeNode(Huffman so) {
		setStoredObj(so);
		setLeft(null);
		setRight(null);
	}

	// definitions of accessors and mutators
	public Huffman getStoredObj() {
		return storedObj;
	}

	public void setStoredObj(Huffman storedObj) {
		this.storedObj = storedObj;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void preorder() {
		System.out.println(this.getStoredObj()); // output the stored value before traversing both children 
		if (this.getLeft() != null)		// if there is left child continue the traverse left child
			this.getLeft().preorder();
		if (this.getRight() != null)	// if there is right child continue the traverse right child
			this.getRight().preorder();	
	}

	//perform inorder traversal at the calling TreeNode object  LNR
	public void inorder() {
		if (this.getLeft() != null)		// if there is left child continue the traverse left child
			this.getLeft().inorder();
		System.out.println(this.getStoredObj());// output the stored value after traversing left child 
		if (this.getRight() != null)	// if there is right child continue the traverse right child
			this.getRight().inorder();	
	}

	//perform postorder traversal at the calling TreeNode object    LRN
	public void postorder() {
		if (this.getLeft() != null)		// if there is left child continue the traverse left child
			this.getLeft().postorder();
		if (this.getRight() != null)	// if there is right child continue the traverse right child
			this.getRight().postorder();	
		System.out.println(this.getStoredObj());  // after traversing both children output the stored value
	}

	public String toString() {

		return storedObj.toString();
	}

	public int compareTo(Object obj){

		if (this.getClass() != obj.getClass())
			return 0;
		TreeNode obj1 = (TreeNode)obj;

		if (this.storedObj.getValue() > obj1.storedObj.getValue())
			return 1;

		if (this.storedObj.getValue() == obj1.storedObj.getValue())
			return 0;

		return -1;
	}

	public Huffman getElement(){
		return storedObj;
	}
}