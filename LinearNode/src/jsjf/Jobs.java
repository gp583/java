//Guilio Piccinonna
//Assignment 4
//Data Structures

package jsjf;

public class Jobs
{
	int jobNumber;
	int arrivalTime;
	int completionTime;
	int processingTime;
	int waitTime;
	int priority;

	public Jobs(int jobNumber, int arrivalTime, int processingTime, int priority) {
		super();
		this.jobNumber = jobNumber;
		this.arrivalTime = arrivalTime;
		this.processingTime = processingTime;
		this.priority = priority;
	}

	public int getJobNumber() {
		return jobNumber;
	}


	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}


	public int getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public int getProcessingTime() {
		return processingTime;
	}


	public void setProcessingTime(int processingTime) {
		this.processingTime = processingTime;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}

	public static String minutesToHours(int minutes){
		int hours;
		int mins;
		String displayMins;

		hours = (minutes / 60);
		mins = (minutes % 60);

		if (hours > 12){
			hours = hours - 12;
		}
		if (mins < 10){
			mins = (mins % 100);
		}

		displayMins =  String.format("%02d", mins);

		return (hours + ":" + displayMins);
	}

	public String toString()
	{

		System.out.printf("Job Number:       Arrival Time:     Completion Time:   Processing Time:      Wait Time:    \n");        
		return String.format("%6d            %8s             %8s         %8s             %7s    \n", jobNumber, minutesToHours(arrivalTime), minutesToHours(completionTime), minutesToHours(processingTime), minutesToHours(waitTime));

	}
}
