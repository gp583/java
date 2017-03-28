//Guilio Piccinonna
//9-15-14
//assign #4

import java.util.*;
public class NFLDriver {

	public static void main(String[] args) {
		Player play1 = new Player ();
		Player play2 = new Player ();
		Player play3 = new Player ();
		Player play4 = new Player ();
		Player play5 = new Player ();
	
		play1.setName("Ryan Tannehill");
		play1.setPosition("Quarterback");
		play1.setCollege("Texas A&M");
		play1.setyearsPro(3);
		play1.printIt();
		play2.setName("Jarvis Landry");
		play2.setPosition("Wide Receiver");
		play2.setCollege("LSU");
		play2.setyearsPro(0);
		play2.printIt();
		play3.setName("Cameron Wake");
		play3.setPosition("Defensive End");
		play3.setCollege("PSU");
		play3.setyearsPro(6);
		play3.printIt();
		play4.setName("Mike Wallace");
		play4.setPosition("Wide Receiver");
		play4.setCollege("Mississippi");
		play4.setyearsPro(6);
		play4.printIt();
		play5.setName("Charles Clay");
		play5.setPosition("Tight End");
		play5.setCollege("Tulsa");
		play5.setyearsPro(4);
		play5.printIt();
		
		Scanner myInput = new Scanner(System.in);
		Player play6 = new Player();
		play6.readInPlayer(myInput);

		Scanner myInput2 = new Scanner(System.in);
		Player play7 = new Player();
		play7.readInPlayer(myInput2);
	
		Scanner myInput3 = new Scanner(System.in);
		Player play8 = new Player();
		play8.readInPlayer(myInput3);
		
		
		if	((play6.getyearsPro()>play7.getyearsPro())&&(play7.getyearsPro()>play8.getyearsPro())){
			System.out.println(play6.getName() + " has the most experience, playing in the league for " + play6.getyearsPro() + " years." );
			System.out.println(play7.getName() + " is in the middle, playing for " + play7.getyearsPro() + " years.");
			System.out.println(play8.getName() + " has the least experience, playing in the league for " + play8.getyearsPro() + " years." );
		}
			 if	((play7.getyearsPro()>play6.getyearsPro())&&((play6.getyearsPro()>play8.getyearsPro()))){
			System.out.println( play7.getName() + " has the most experience, playing in the league for " + play7.getyearsPro() + " years." );
			System.out.println( play6.getName() + " is in the middle, playing for " + play6.getyearsPro() + " years.");
			System.out.println( play8.getName() + " has the least experience, playing in the league for " + play8.getyearsPro() +  " years." );
			 }
			 if	((play8.getyearsPro()>play7.getyearsPro())&&((play7.getyearsPro()>play6.getyearsPro()))){
				System.out.println(play8.getName() + " has the most experience, playing in the league for " + play8.getyearsPro() + " years." );
				System.out.println(play7.getName() + " is in the middle, playing for " + play7.getyearsPro() + " years.");
				System.out.println(play6.getName() + " has the least experience, playing in the league for " + play6.getyearsPro() + " years." );
			 
			 
			 }
	}
}
	

//program uses 3 scanners to read in 3 objects, then sorts by length of time in the league.
		
/*Ryan Tannehill is a Quarterback out of Texas A&M that has been in the league 3 years.
Jarvis Landry is a Wide Receiver out of LSU that has been in the league 0 years.
Cameron Wake is a Defensive End out of PSU that has been in the league 6 years.
Mike Wallace is a Wide Receiver out of Mississippi that has been in the league 6 years.
Charles Clay is a Tight End out of Tulsa that has been in the league 4 years.

What is the player's name?
steve smith
College? 
UM
What is the position of the player? 
wide receiver
And career length? (in years): 
3
What is the player's name?
john doe
College? 
florida
What is the position of the player? 
quarterback
And career length? (in years): 
4
What is the player's name?
john stevenson
College? 
georgia
What is the position of the player? 
kicker
And career length? (in years): 
6

john stevenson has the most experience, playing in the league for 6 years.
john doe is in the middle, playing for 4 years.
steve smith has the least experience, playing in the league for 3 years. */