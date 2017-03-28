import java.util.*;

public class Player implements Comparable {

	String fName;
	String lName;
	String position;
	int salary;
	int number;

	public Player(){
		
	}

	public Player(String f, String l, String p, int s){
		fName = f;
		lName = l;
		position = p;
		salary = s;
	}
	
	public Player(int n, String f, String l, String p, int s){
		number = n;
		fName = f;
		lName = l;
		position = p;
		salary = s;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int compareTo(Object obj){
		Player player2 = (Player) obj;
		
		if(player2.getfName() != null){
			
		if (this.getClass() != obj.getClass())
			return 0;
		
		if (this.getSalary() > player2.getSalary())
			return -1;
		if (this.getSalary() < player2.getSalary())
			return 1;
		return 0;
		}
		return 0;
	}

	public static String salaryF(int dollars){
		int hundreds;
		int thousands;
		int millions;
		String hundy;
		String tens = null;
		
		hundreds = (dollars % 1000);
		thousands = ((dollars % 1000000) / 1000);
		millions = ((dollars / 1000000));
		
		if (millions == 0){
			
		if (hundreds == 0){
			hundy = "000";
		return ("$" + thousands + "," + hundy);
		}
		
		if ((hundreds / 100) == 0){
			tens = ("0" + hundreds);
			return ("$" + thousands + "," + tens);
		}
		
		return ("$" + thousands + "," + hundreds);
			
		}
		
		if (hundreds == 0){
			hundy = "000";
			
		return ("$" + millions + "," + thousands + "," + hundy);
		}
		
		return ("$" + millions + "," + thousands + "," + hundreds);
	}
	
	public String toString() {
		if (number == 0){
			
		String result = String.format("%-10s             %-10s         %6s           %1s    ", fName, lName, position, salaryF(salary));
		return result;
		
		}
		
		String result = String.format("%6d    %-10s             %-10s         %6s           %1s    ", number, fName, lName, position, salaryF(salary));
		return result;
		
	}
}
