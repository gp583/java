
import java.io.*;
import java.util.*;

public class NFLMain {
	ArrayList<Player> roster = new ArrayList <Player>();
	static int FinsCap = 153532113;
	static int NFLCap = 150000000;
	static int CapSpace = (NFLCap - FinsCap);

	public static void main(String[]args){
		NFLMain season = new NFLMain();
		Scanner kb  = new Scanner(System.in);
		ArrayList<Player> roster = new ArrayList <Player>();
		int i;
		Scanner myFile;
		String fileName = "dolphins.txt";
		boolean notFound = true;
		String temp;
		StringTokenizer st;
		String junk;
		int wrongCount = 0;
		int FinsCap = 146217074;

		while (notFound){
			try {
				myFile = new Scanner(new File(fileName));
				notFound = false;
				for (i = 0; i < 38; i++){
					temp = myFile.nextLine();
					st = new StringTokenizer (temp, " ");
					String lname = st.nextToken();
					String fname = st.nextToken();
					String position = st.nextToken();
					int salary = Integer.parseInt(st.nextToken());
					roster.add(new Player(fname, lname, position, salary));
				}
				myFile.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("Incorrect file, please re-enter");
				wrongCount++;
				fileName = kb.nextLine();
				if (wrongCount == 3)
					break;
			}
		}

		for (i = 0; i < roster.size(); i++){
			System.out.println(roster.get(i));
		}

		System.out.print("Current cap space: ");
		System.out.println(salaryF(CapSpace));	
		System.out.println();

		try {
			season.cutPlayer(roster);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		//freeAgents(roster);
	}


	public static int totalCap(ArrayList<Player> roster){
		int totalCap = 0;

		for (int i = 0; i < roster.size(); i++)
			totalCap += roster.get(i).getSalary();

		return totalCap;
	}

	public ArrayList<Player> cutPlayer(ArrayList<Player> roster) throws FileNotFoundException{
		Scanner kb = new Scanner(System.in);
		StringTokenizer st;
		String cutFname;
		String cutLname;
		int cutSalary = 0;
		int index = -1;
		boolean notFound = true;

		String cutPlayer;
		System.out.println("Enter player you wish to cut:");

		while (notFound){
			cutPlayer = kb.nextLine();
			st = new StringTokenizer(cutPlayer," ");
			cutFname = st.nextToken();
			cutLname = st.nextToken();
			notFound = false;

			for (int i = 0; i < roster.size(); i++){
				if (roster.get(i).getfName().equalsIgnoreCase(cutFname) && (roster.get(i).getlName().equalsIgnoreCase(cutLname)))
					index = i;
				cutSalary = roster.get(i).getSalary();
			}
		}


		System.out.println(roster.get(index).getfName() + " " + roster.get(index).getlName() + " has been cut from the Miami Dolphins");
		roster.remove(index);

		CapSpace += cutSalary;

		System.out.println("Available funds:  " + salaryF(CapSpace));

		return roster;
	}



	public ArrayList<Player> freeAgents(ArrayList<Player> roster){
		Scanner kb  = new Scanner(System.in);
		ArrayList<Player> fas = new ArrayList <Player>();
		int i;
		int j = 0;
		Scanner myFile;
		String fileName = "dolphinsFA.txt";
		boolean notFound = true;
		String temp;
		StringTokenizer st;
		String junk;
		int wrongCount = 0;
		int cap = 146217074;

		while (notFound){
			try {
				myFile = new Scanner(new File(fileName));
				notFound = false;
				for (i = 0; i < 18; i++){
					temp = myFile.nextLine();
					st = new StringTokenizer (temp, " ");
					String lname = st.nextToken();
					String fname = st.nextToken();
					String position = st.nextToken();
					int salary = Integer.parseInt(st.nextToken());
					j++;
					fas.add(new Player(j, fname, lname, position, salary));
				}
				myFile.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("Incorrect file, please re-enter");
				wrongCount++;
				fileName = kb.nextLine();
				if (wrongCount == 3)
					break;
			}
		}
		System.out.println("Which free agents do you wish to re-sign?");
		System.out.print("Enter number");
		System.out.println();
		for (i = 0; i < fas.size(); i++){
			System.out.println(fas.get(i));
		}
		System.out.println();
		System.out.println("Current salary cap:" + (NFLCap - FinsCap));

		return roster;
	}





	public static String salaryF(int dollars){
		int hundreds;
		int thousands;
		int millions;
		String hundy;
		String tens = null;
		String thous;

		hundreds = (dollars % 1000);
		thousands = ((dollars % 1000000) / 1000);
		millions = ((dollars / 1000000));

		if (millions == 0){

			if (hundreds == 0){
				hundy = "000";
				if (dollars < 0)
					if (dollars / 10000 < 1){
						thous = "00" + (dollars/1000);
						return ("-$" + thous + "," + hundy);
					}

				return ("-$" + Math.abs(thousands) + "," + hundy);

			}

			if ((hundreds / 100) == 0){
				tens = ("0" + hundreds);
				if (dollars < 0){
					if (dollars / 10000 < 1){
						thous = "00" + (dollars/1000);
						return ("-$" + thous + "," + tens);
					}
					return ("-$" + Math.abs(thousands) + "," + tens);
				}
				return ("$" + thousands + "," + tens);
			}

			if (dollars < 0){
				if (dollars / 10000 < 1){
					thous = "00" + (dollars/1000);
					return ("-$" + thous + "," + Math.abs(hundreds));
				}
				return ("-$" + Math.abs(thousands) + "," + Math.abs(hundreds));
			}
			return ("$" + thousands + "," + hundreds);
		}

		if (hundreds == 0){
			if (dollars < 0){
				if (dollars / 10000 < 1){
					hundy = "000";
					thous = "00" + (dollars/1000);
					return ("-$" + Math.abs(millions) + "," + thous + "," + hundy);
				}
				hundy = "000";
				return ("-$" + Math.abs(millions) + "," + Math.abs(thousands) + "," + hundy);
			}
			if (dollars / 10000 < 1){
				hundy = "000";
				thous = "00" + (dollars/1000);
				return ("$" + millions + "," + thous + "," + hundy);
			}
			hundy = "000";
			return ("$" + millions + "," + thousands + "," + hundy);
		}

		if (dollars < 0){
			if ((dollars % 10000) < 1){
				thousands = (((Math.abs(dollars/1000) - (dollars/1000000)*1000))%1000);
				return ("-$" + Math.abs(millions) + "," + thousands + "," + Math.abs(hundreds));
			}
			
			return ("-$" + Math.abs(millions) + "," + Math.abs(thousands) + "," + Math.abs(hundreds));
		}
		
		if ((dollars / 10000) < 1){
			thous = "00" + (dollars / 1000);
			return  ("$" + millions + "," + thous + "," + hundreds);
		}
		return ("$" + millions + "," + thousands + "," + hundreds);	
	}
}
