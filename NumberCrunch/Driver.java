import java.text.NumberFormat;

import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Driver {

	ArrayList<Obj> obj = new ArrayList<Obj>();
	ArrayList<Obj> leed = new ArrayList<Obj>();
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ParseException 
	{
		// TODO Auto-generated method stub
		ArrayList<Obj> obj = new ArrayList<Obj>();
		
		Scanner s = new Scanner(new File("FINAL.csv"));
		String line;
		int size, card, dry, metal, plastic, wood, out, clean;
		
		while(s.hasNextLine())
		{
			line = s.nextLine();
			
			
			StringTokenizer t = new StringTokenizer(line, ",");
			//System.out.println(line);
			String w = t.nextToken();
			NumberFormat nf = NumberFormat.getInstance();
			double weight = nf.parse(w).doubleValue();
			
			//double weight = Double.parseDouble(w);
			@SuppressWarnings("unused")
			String random = t.nextToken();
			size = Integer.parseInt(t.nextToken());
			card = Integer.parseInt(t.nextToken());
			dry = Integer.parseInt(t.nextToken());
			metal = Integer.parseInt(t.nextToken());
			plastic = Integer.parseInt(t.nextToken());
			wood = Integer.parseInt(t.nextToken());
			out = Integer.parseInt(t.nextToken());
			clean = Integer.parseInt(t.nextToken());
			
			int test = find(obj, weight, size);
			
			if(test < 0)
			{
				obj.add(new Obj(weight,size,card,dry,metal,plastic,wood,out,clean));
			}
			else
			{
				obj.get(test).add(card,dry,metal,plastic,wood,out,clean);
			}
			
			
		}
		s.close();
		PrintWriter w = new PrintWriter("output.csv", "UTF-8");
		
		for(int i = 0; i<obj.size(); i++)
		{
			w.println( obj.get(i).toString());
		}
		
		for(int i = 0; i<obj.size(); i++)
		{
			System.out.println( obj.get(i).toString());
		}
		
		w.close();

	}


public static int find(ArrayList<Obj> obj, double weight, int size)
{
	int found = -1;
	
	for(int i = 0; i < obj.size(); i++)
	{
		if(weight == obj.get(i).weight )
		{
			if(size == obj.get(i).size)
				found = i;
		}
	}
	
	return found;
}
}

