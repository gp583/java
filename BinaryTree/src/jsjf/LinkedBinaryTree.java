//Guilio Piccinonna
//Assignment 8

package jsjf;

public class LinkedBinaryTree{

	private BinaryTreeNode root;  	// root of the tree stored here

	// emtpy constructor - root not know
	public LinkedBinaryTree() {
		setRoot(null);
	}

	// constructor with the known valyue of the root
	public LinkedBinaryTree(BinaryTreeNode node) {
		setRoot(node);
	}

	// accessor of the root
	public BinaryTreeNode getRoot() {
		return root;
	}

	// muitator for the root
	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	// insert a value starting at the root
	public void insert(GolfCourse golfCourse){
		BinaryTreeNode temp = new BinaryTreeNode(golfCourse);

		if (root == null)
			root = temp;			// insert at the root if a root is not there
		else
			root.insert(temp);		// concentrate on inserting at the root
	}

	// do a preorder traversal starting at the root
	public void preorder() {
		if (root == null)		// nothing in the tree
			System.out.println("The tree is empty - nothing to output");
		else {
			System.out.println("The preorder traversal of the tree is:\n");
			printHeader();
			root.preorder();	// print out values at all TreeNodes
			System.out.println();
		}	
	}

	// do a preorder traversal starting at the root
	public void inorder() {
		if (root == null)		// nothing in the tree
			System.out.println("The tree is empty - nothing to output");
		else {
			System.out.println("The inorder traversal of the tree is:\n");
			printHeader();
			root.inorder();	// print out values at all TreeNodes
			System.out.println();
		}	
	}

	// do a postorder traversal starting at the root
	public void postorder() {
		if (root == null)		// nothing in the tree
			System.out.println("The tree is empty - nothing to output");
		else {
			System.out.println("The postorder traversal of the tree is:\n");
			printHeader();
			root.postorder();	// print out values at all TreeNodes
			System.out.println();
		}	
	}

	// print out a header for neatly aligned data
	public void printHeader() {
		System.out.println("Golf Course                                                      Location                  Greens Fees      Par                Designer                                             Year Built        Yards");
		System.out.println("-----------                                                      ---------                 -----------     -----               --------                                             ----------        ----- ");
	}
}
