//Guilio Piccinonna
//Assignment 11
//12-10-15

package assignment11;

public class Trip {

	int mpg;
	int tankSize;
	int numStations;
	int tripDistance;
	Station[] stationList;

	public Trip(int m, int t, int n, int d, Station[] s) {
		mpg = m;
		tankSize = t;
		numStations = n;
		tripDistance = d;
		stationList = s;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public int getNumStations() {
		return numStations;
	}

	public void setNumStations(int numStations) {
		this.numStations = numStations;
	}

	public int getTripDistance() {
		return tripDistance;
	}

	public void setTripDistance(int tripDistance) {
		this.tripDistance = tripDistance;
	}

	public Station[] getStationList() {
		return stationList;
	}

	public void setStationList(Station[] stationList) {
		this.stationList = stationList;
	}

	public void Dijkstra() {
		int startLoc = 0;
		int testLoc = startLoc + 1;
		int maxMile = tankSize * mpg;
		this.getStationList()[0].finalized = true;
		this.getStationList()[0].currentMinCost = 0;
		int temp;
		double newCost;
		int whereFound = 0;
		double currentMin = Integer.MAX_VALUE;


		while (!this.getStationList()[numStations * 2 - 1].isFinalized()){

			while ((testLoc < this.getNumStations() * 2)
					&& ((this.getStationList()[testLoc].getMileMarker() - this
							.getStationList()[startLoc].getMileMarker()) <= maxMile)) {

				newCost = ((double)(this.getStationList()[testLoc].getMileMarker() - this
						.getStationList()[startLoc].getMileMarker()) / this
						.getMpg())
						* this.getStationList()[testLoc].getCostPerGal()
						+ this.getStationList()[startLoc].currentMinCost;

				if (newCost < this.getStationList()[testLoc].getCurrentMinCost()) {
					this.getStationList()[testLoc].setCurrentMinCost(newCost);
					this.getStationList()[testLoc].setByWayOf(startLoc);
					System.out.println("new current min at: " + testLoc + " new cost: " + newCost );
				}

				testLoc++;
			}
			testLoc = startLoc + 1;
			currentMin = Integer.MAX_VALUE;
			whereFound = 0;

			while (testLoc < this.getNumStations() * 2){
				if (!this.getStationList()[testLoc].finalized) {
					if (this.getStationList()[testLoc].getCurrentMinCost() < currentMin) {
						whereFound = testLoc;
						currentMin = this.getStationList()[testLoc].getCurrentMinCost();
					}
					testLoc++;
				}
			}
			startLoc = whereFound;
			testLoc = startLoc + 1;
			this.getStationList()[startLoc].setFinalized(true);
			System.out.println(this.getStationList()[startLoc].getCurrentMinCost() + "  " + startLoc);
		//	System.out.println(this.getStationList()[startLoc+1].getCurrentMinCost() + "  " + (startLoc+1));
		//	System.out.println(this.getStationList()[startLoc+2].getCurrentMinCost() + "  " + (startLoc+2));
		}


		System.out.println(this.getStationList()[numStations * 2 - 1].getCurrentMinCost());
	}
}

