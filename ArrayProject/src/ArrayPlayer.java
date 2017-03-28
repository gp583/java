import java.util.*;

public class ArrayPlayer implements Comparable{

	private String name;
	private String position;
	private String college;
	private int yearsPro;

	public ArrayPlayer(){
	}

	public ArrayPlayer(String n, String p, String c, int y) {
		name = n;
		position = p;
		college = c;
		yearsPro = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getyearsPro() {
		return yearsPro;
	}
	public void setYearsPro(int yearsPro) {
		this.yearsPro = yearsPro;
	}

	public void readInPlayer(Scanner myInput) {
		int tempYearsPro;
		String temp;

		System.out.println("What is the player's name?");
		temp = myInput.nextLine();
		this.setName(temp);
		System.out.println("College? ");
		temp = myInput.nextLine();
		setCollege(temp);
		System.out.println("What is the position of the player? ");
		temp = myInput.nextLine();
		this.setPosition(temp);
		System.out.println("And career length? (in years): ");
		tempYearsPro = myInput.nextInt();
		setYearsPro(tempYearsPro);
	}

	public String toString() {
		return "Miami Dolphin " + name + " is a " + position + " out of " + college + ""
				+ ". He has been in the league for " + yearsPro + " years.";
	}

	public int compareTo(Object obj){
		if (this.getClass() != obj.getClass())
			return 0;
		ArrayPlayer other = (ArrayPlayer) obj;
		//			return this.name.compareTo(other.name);

		if (this.yearsPro > other.yearsPro)
			return -1;
		if (this.yearsPro < other.yearsPro)
			return 1;
		return 0;

	}
}
