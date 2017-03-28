import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FanDriver {

	
		public static void main(String[] args) { 
			menu();	
		}
		
		public static void menu(){
			RunningBack rBacks;
			int junk;
			String junk2;
			String lname;
			String fname; 
			String team;
			String opponent;
			String gameLoc;
			int salary;
			int salaryChange;
			double points;
			int gamesPlayed;
			double pointsPerGame;
			double pointsPerDollar;
			double pointPerGame;
			double projPoints;
			int byeWeek;
			double proj = 0;
			
			try {
				StringTokenizer st;
				String temp;
				Scanner rbFile = new Scanner(new File("rbsWeek5.txt"));
				ArrayList<RunningBack> rbs = new ArrayList<RunningBack>();
				for (int i = 0; i < 120; i++){
					temp = rbFile.nextLine();
					st = new StringTokenizer(temp, " ;");
					junk = Integer.parseInt(st.nextToken());
					junk2 = st.nextToken();
					lname = st.nextToken();
					fname = st.nextToken();
					team = st.nextToken();
					opponent = st.nextToken();
					gameLoc = st.nextToken();
					salary = Integer.parseInt(st.nextToken());
					salaryChange = Integer.parseInt(st.nextToken());
					points = Double.parseDouble(st.nextToken());
					gamesPlayed = Integer.parseInt(st.nextToken());
					pointsPerGame = Double.parseDouble(st.nextToken());
					pointsPerDollar = Double.parseDouble(st.nextToken());
					pointPerGame = Double.parseDouble(st.nextToken());
					byeWeek = Integer.parseInt(st.nextToken());
					rBacks = new RunningBack(lname, fname, team, opponent, gameLoc, salary, salaryChange, points, gamesPlayed, pointsPerGame, pointsPerDollar, pointPerGame, byeWeek, proj);
					rbs.add(rBacks);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
