//Guilio Piccinonna
//Assignment 9

package assignment9;

public class Huffman {

	String letter;
	int value;

	public Huffman(String l, int v){
		letter = l;
		value = v;
	}

	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		String result = String.format("%-4s, %-4d\n", letter, value);

		return result;
	}
}
