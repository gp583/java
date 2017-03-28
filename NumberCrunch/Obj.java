
public class Obj {

	double weight;
	int add;
	int size, card, dry, metal, plastic, wood, out, clean;
	String flag = "";
	String comma = ",";
	String print;
	public Obj(double weight,int size,int card, int dry, int metal, int plastic, int wood, int out, int clean) 
	{
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.size = size;
		this.card = card;
		this.dry = dry;
		this.metal = metal;
		this.plastic = plastic;
		this.wood = wood;
		this.out = out;
		this.clean = clean;
		add = 1;
	}
	
	public void add(int c, int d, int m, int p, int w, int o, int cl)
	{
		
		card += c;
		dry += d;
		metal += m;
		plastic += p;
		wood += w;
		out += o;
		clean += cl;
		add++;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String toString()
	{
		
		card= card / add;
		dry = dry / add;
		metal = metal / add;
		plastic = plastic / add;
		wood = wood / add;
		out = out / add;
		clean = clean / add;
		int total = card +dry+metal+plastic+wood +out +clean;
		if(total != size)
			flag = "f";
		print = weight +comma +size+comma+card+comma+dry+comma+metal+comma+plastic+comma+wood+comma+out+comma+clean+comma+flag+comma+add;
		return print;
	}
	

}
