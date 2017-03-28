//Guilio Piccinonna
//Assignment 11
//12-10-15

package assignment11;

public class Station {

	int stationNo;
	int mileMarker;
	double costPerGal;
	int byWayOf;
	boolean finalized;
	double currentMinCost;
	
	public Station(int s, int mM, double cpg){
		stationNo = s;
		mileMarker = mM;
		costPerGal = cpg;
		currentMinCost = Integer.MAX_VALUE;
		finalized = false;
		byWayOf = -1;
	}


	public int getStationNo() {
		return stationNo;
	}


	public void setStationNo(int stationNo) {
		this.stationNo = stationNo;
	}


	public int getMileMarker() {
		return mileMarker;
	}


	public void setMileMarker(int mileMarker) {
		this.mileMarker = mileMarker;
	}


	public double getCostPerGal() {
		return costPerGal;
	}


	public void setCostPerGal(double costPerGal) {
		this.costPerGal = costPerGal;
	}


	public int getByWayOf() {
		return byWayOf;
	}


	public void setByWayOf(int byWayOf) {
		this.byWayOf = byWayOf;
	}


	public boolean isFinalized() {
		return finalized;
	}


	public void setFinalized(boolean finalized) {
		this.finalized = finalized;
	}


	public double getCurrentMinCost() {
		return currentMinCost;
	}


	public void setCurrentMinCost(double currentMinCost) {
		this.currentMinCost = currentMinCost;
	}
	
	
}
