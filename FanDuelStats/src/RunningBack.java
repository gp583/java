
public class RunningBack {

	String lName;
	String fName;
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
	int junk;
	
	public RunningBack(String f, String l, String t, String o, String g, int s, int sC, double pts, int gP, double ppg, double ppd, double ppgs, int b, double proj){
		fName = f;
		lName = l;
		team = t;
		opponent = o;
		gameLoc = g;
		salary = s; 
		salaryChange = sC;
		points = pts;
		gamesPlayed = gP;
		pointsPerGame = ppg;
		pointsPerDollar = ppd;
		pointPerGame = ppgs;
		byeWeek = 9;
		projPoints = proj;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getOpponent() {
		return opponent;
	}

	public void setOpponent(String opponent) {
		this.opponent = opponent;
	}

	public String getGameLoc() {
		return gameLoc;
	}

	public void setGameLoc(String gameLoc) {
		this.gameLoc = gameLoc;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalaryChange() {
		return salaryChange;
	}

	public void setSalaryChange(int salaryChange) {
		this.salaryChange = salaryChange;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public double getPointsPerGame() {
		return pointsPerGame;
	}

	public void setPointsPerGame(double pointsPerGame) {
		this.pointsPerGame = pointsPerGame;
	}

	public double getPointsPerDollar() {
		return pointsPerDollar;
	}

	public void setPointsPerDollar(double pointsPerDollar) {
		this.pointsPerDollar = pointsPerDollar;
	}

	public double getPointPerGame() {
		return pointPerGame;
	}

	public void setPointPerGame(double pointPerGame) {
		this.pointPerGame = pointPerGame;
	}

	public int getByeWeek() {
		return byeWeek;
	}

	public void setByeWeek(int byeWeek) {
		this.byeWeek = byeWeek;
	}
	
	public String toString()
	{

		return String.format("%11s            %11s             %11d                  $%11d            $%11d    ", fName, lName, team, salary, points, projPoints);
}
	
	
}
