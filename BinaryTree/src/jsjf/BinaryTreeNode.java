//Guilio Piccinonna
//Assignment 8

package jsjf;

public class BinaryTreeNode
{
	private GolfCourse storedObj;	// hold the Golf Course object stored in the Tree
	private BinaryTreeNode left;		// hold a pointer (memory address) to the left child 
	private BinaryTreeNode right;		// hold a pointer (memory address) to the right child 

	// empty constructor
	public BinaryTreeNode() {
		setStoredObj(null);
		setLeft(null);
		setRight(null);
	}

	// constructor with a known Golf Course object
	public BinaryTreeNode(GolfCourse so) {
		setStoredObj(so);
		setLeft(null);
		setRight(null);
	}

	// definitions of accessors and mutators
	public GolfCourse getStoredObj() {
		return storedObj;
	}

	public void setStoredObj(GolfCourse storedObj) {
		this.storedObj = storedObj;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	// insert the new TreeNode at the calling TreeNode object
	public void insert(BinaryTreeNode tn) { 
		// if new insert value is less than the value at the calling object look left

		if (this.getStoredObj().getGreensFee()>tn.getStoredObj().getGreensFee()){
			if (this.getLeft() == null)  // if null store it there
				this.setLeft(tn);
			else
				this.getLeft().insert(tn);  // otherwise call insert at the left child
		} else {  // if new insert value is not less than the value at the calling object look right
			if (this.getRight() == null)   // if null store it there
				this.setRight(tn);
			else
				this.getRight().insert(tn);   // otherwise call insert at the right child
		}
	}

	//perform preorder traversal at the calling TreeNode object  NLR
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
}
