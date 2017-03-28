//Guilio Piccinonna
//Assignment 11
//12-10-15

package assignment11;
import java.io.*;
import java.util.*;

public class RoadTripMain {


	public static void main(String[] args) {
		
		Scanner kb  = new Scanner(System.in);
		Scanner myFile;
		boolean found = true;
		String fileName = "gas.txt";
		StringTokenizer st;
		String temp;
		int mpg;
		int tankSize;
		int numStations; 
		int tripDistance;
		int mileMarker;
		double costPerGallon;
		int wrongCount = 0;
		Station stationList[] = null;

		 
			try{ 
				myFile = new Scanner(new File(fileName));
				while (found){
				temp = myFile.nextLine();
				st = new StringTokenizer(temp);
				mpg = Integer.parseInt(st.nextToken());
				tankSize = Integer.parseInt(st.nextToken());
				if ((mpg == 0) && (tankSize == 0))
					break;
				temp = myFile.nextLine();
				st = new StringTokenizer(temp);
				numStations = Integer.parseInt(st.nextToken());
				tripDistance = Integer.parseInt(st.nextToken());
				stationList = new Station[numStations*2];

				for (int i = 0; i < numStations; i++){
					temp = myFile.nextLine();
					st = new StringTokenizer(temp);
					mileMarker = Integer.parseInt(st.nextToken());
					costPerGallon = Double.parseDouble(st.nextToken());
					stationList[i] = new Station(i, mileMarker, costPerGallon);
				}
				
				for (int i = numStations; i < (numStations*2); i++){
					mileMarker = (tripDistance * 2) - stationList[2*numStations - 1 - i].getMileMarker();
					costPerGallon = stationList[2*numStations - 1 - i].getCostPerGal();
					stationList[i] = new Station(i, mileMarker, costPerGallon);
				}
				
				Trip serTrip = new Trip(mpg, tankSize, numStations, tripDistance, stationList);
				serTrip.Dijkstra();
			}
				
			}
			catch (FileNotFoundException e) {
				System.out.println("Incorrect file, please re-enter");
				wrongCount++;
				fileName = kb.nextLine();
				if (wrongCount == 3)
				found = false;
			}
			kb.close();
		}
	}



