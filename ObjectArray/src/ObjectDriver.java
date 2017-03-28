import java.util.*;


public class ObjectDriver {

	public static void main(String[] args) {
		Object [] allStuff = new Object[15];
		String [] names = new String[20];
		ArrayList<String> names2 = new ArrayList<String>();
		Scanner keyboard=new Scanner (System.in);
		int i;
		
//		for ( i = 0; i < 21; i++)
//			names2.add(keyboard.nextLine());
		for ( i = 0; i < 21; i++)
			names[i] = keyboard.nextLine();
//		Collections.sort(names2);
		Arrays.sort(names);
//		for ( i = 0; i < 21; i++)
//			System.out.println("" + (i+1) + ": " + names2.get(i));
		for (i = 0; i < 21; i++)
			System.out.println("" + (i+1) + ": " + names[i]);
		VideoGame vid1= new VideoGame ();
		//VideoGame vid2= new VideoGame ();
		//VideoGame vid3= new VideoGame ();
		
		//Inputting data to objects through keyboard
		vid1.readInData(keyboard);
		//vid2.readInData(keyboard);
		//vid3.readInData(keyboard);
		
		Flower flow3 = new Flower();
		flow3.readInFlower();
		
		//Flower flow4 = new Flower();
		//flow4.readInFlower();
		
		//Flower flow5 = new Flower();
		//flow5.readInFlower();	
		
		Player play1 = new Player ();
		Player play2 = new Player ();
		Player play3 = new Player ();
	
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

		Supercar spcar1 = new Supercar("Mazda", "Japan", 6.0, 15140);
		Supercar spcar2 = new Supercar("Ferrari 458", "Italy", 3.3, 200000);
		Supercar spcar3 = new Supercar();
		spcar3.setMakeAndModel("Trimuph TR5");
		spcar3.setCountry("Great Britain");
		spcar3.setZeroTo60(9.0);
		spcar3.setTotalCost(16000);
		
		Sandwich sand1 = new Sandwich();//identifying sand1's variables
		Sandwich sand2 = new Sandwich();//(identifying sand2's variables)
		Sandwich sand3 = new Sandwich();//(identifying sand3's variables)
		
		//sand1.SandwichIngrediants();
		sand1.setSandwich("Swiss", "Salami", 8.95, "Rye");	
		sand1.getSandwich();//printing our sandwich
		
		//sand2.SandwichIngrediants();
		sand2.setSandwich("None", "Turkey",100.96,"Exotic");
		sand2.getSandwich();//printing a second sandwich
		
		sand3.SandwichIngrediants();
		//sand3.setSandwich("moldy", "Manatee", 52.72, "Maokai");
		sand3.getSandwich();//printing a third sandwich
		allStuff[0] = sand1;
		allStuff[1] = vid1;
		allStuff[2] = play1;
		allStuff[3] = flow3;
		allStuff[4] = sand2;
		allStuff[5] = spcar3;
		allStuff[6] = spcar1;
		allStuff[8] = play3;
		allStuff[9] = spcar2;
		allStuff[10] = play2;
		allStuff[7] = sand3;
		allStuff[11] = 34;
		allStuff[12] = new Double(134.52);
		allStuff[13] = "Hello World!";
		for (i = 0; i < 14; i++){
		    System.out.println("output of a " + allStuff[i].getClass() + " Object\n" + allStuff[i]);

		}
				
	}

}
