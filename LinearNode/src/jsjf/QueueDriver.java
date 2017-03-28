//Guilio Piccinonna
//Assignment 4
//Data Structures

package jsjf;
import java.io.*;
import java.util.*;

public class QueueDriver {

	public static void main(String[] args) { 
		processJobs();
	}

	public static void processJobs(){
		LinkedQueue<Jobs> queueOne = new LinkedQueue<Jobs>();
		LinkedQueue<Jobs> queueTwo = new LinkedQueue<Jobs>();
		LinkedQueue<Jobs> queueThree = new LinkedQueue<Jobs>();
		LinkedQueue<Jobs> queueFour = new LinkedQueue<Jobs>();
		LinkedQueue<Jobs> jobQueue = new LinkedQueue<Jobs>();
		Jobs cpuJob = null;

		String filename = "JobQueue.txt";
		int size = 0;
		String temp;
		StringTokenizer st;
		int hours;
		int minutes;
		int currentTime = 0;
		int arrivalTime;
		int priority;
		int processingTime;
		int jobNumber;
		int jobsCompleted = 0;
		Jobs tempjob;

		try {
			Scanner jobs = new Scanner(new File(filename));
			size = jobs.nextInt();
			temp = jobs.nextLine();
			for (int i = 1; i <= size; i++){
				temp = jobs.nextLine();
				st = new StringTokenizer(temp, " :");
				hours = Integer.parseInt(st.nextToken());
				hours = hours * 60;
				minutes = Integer.parseInt(st.nextToken());
				arrivalTime = hours + minutes;
				processingTime = 	Integer.parseInt(st.nextToken());
				priority = Integer.parseInt(st.nextToken());
				jobNumber = i;
				tempjob = new Jobs(i, arrivalTime, priority, processingTime);
				jobQueue.enqueue(tempjob); 
			} 
			jobs.close();
			currentTime = jobQueue.first().getArrivalTime();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		while (jobsCompleted != size){

			if (!jobQueue.isEmpty() && jobQueue.first().getArrivalTime() == currentTime){
				switch (jobQueue.first().getPriority()){
				case 1: queueOne.enqueue(jobQueue.dequeue());
				break;
				case 2: queueTwo.enqueue(jobQueue.dequeue());
				break;
				case 3: queueThree.enqueue(jobQueue.dequeue());
				break; 
				case 4: queueFour.enqueue(jobQueue.dequeue());
				break;
				}
			}

			if ((cpuJob != null ) && (cpuJob.completionTime == currentTime) ){
				System.out.println(cpuJob);
				cpuJob = null;
				jobsCompleted++;
			}

			if (cpuJob == null){
				if (!queueOne.isEmpty())
					cpuJob = queueOne.dequeue();
				else 
					if (!queueTwo.isEmpty())
						cpuJob = queueTwo.dequeue();
					else 
						if (!queueThree.isEmpty())
							cpuJob = queueThree.dequeue();
						else
							if (!queueFour.isEmpty())
								cpuJob = queueFour.dequeue();

				if (cpuJob != null){
					cpuJob.completionTime = cpuJob.processingTime + currentTime;
					cpuJob.waitTime = currentTime - cpuJob.arrivalTime;
				}
			}
			currentTime++;
		}
	}
}


