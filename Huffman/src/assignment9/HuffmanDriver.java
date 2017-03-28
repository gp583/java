//Guilio Piccinonna
//Assignment 9

package assignment9;
import java.io.*;
import java.util.*;


public class HuffmanDriver {

	public static void main(String[] args) throws FileNotFoundException{ 

		ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
//		boolean notFound = true;
		int numberNodes;
		String letters;
		int values;
		TreeNode node;
		Huffman huffman;
		Scanner scan = new Scanner(new File("Huffman.txt"));

		while (scan.hasNextLine()) {
			  
				numberNodes = scan.nextInt();

				for (int i = 0; i < numberNodes; i++){
					letters = scan.next();
					values = scan.nextInt();
					huffman = new Huffman(letters, values);
					node = new TreeNode(huffman);
					scan.nextLine();
					nodes.add(node);
				}
				
			}
			scan.close();
			Collections.sort(nodes);

		
		while (nodes.size() > 1){
			letters = nodes.get(0).getElement().getLetter() + nodes.get(1).getElement().getLetter();
			values = nodes.get(0).getElement().getValue() + nodes.get(1).getElement().getValue();
			huffman = new Huffman(letters, values);
			node = new TreeNode(huffman);
			node.setLeft(nodes.get(0));
			node.setRight(nodes.get(1));
			nodes.add(node);
			nodes.remove(0);
			nodes.remove(0);
			Collections.sort(nodes);
			
		}
		System.out.println(nodes);
		System.out.println(decoder("001011011010011", nodes.get(0)));
	}
	

	public static String decoder(String code, TreeNode root){

		TreeNode node = root;
		String message = "";
		int i = 0;
		for (;i < code.length(); i++)
		{
			if(code.charAt(i) == '0')
			{
				if (node.getLeft() != null){
					node = node.getLeft();
					System.out.println(node.getElement().getLetter());
				}
				else
				{
					message = message + node.getElement().getLetter();
					node = root;
					i--;
				System.out.println(node.getElement().getLetter());
				}
			}
			else
			{
				if (node.getRight() != null){
					node = node.getRight();
					System.out.println(node.getElement().getLetter());
				}
				else
				{
					message = message + node.getElement().getLetter();
					node = root;
					i--;
				}
			}
			if (i == code.length() - 1){
				message = message + node.getElement().getLetter();
			}
		}
		return message;
	}
}
