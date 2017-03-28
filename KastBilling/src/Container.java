
public class Container {

	String date;
	int ticketNo;
	int size;
	String descript;
	int fFee;
	int price;

	public Container(String d, int t, int s, String de, int f, int p) {
		date = d;
		ticketNo = t;
		descript = de;
		size = s;
		fFee = f;
		price = p;
	}

	public Container(String d, int t, int s) {
		date = d;
		ticketNo = t;
		size = s;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getfFee() {
		return fFee;
	}

	public void setfFee(int fFee) {
		this.fFee = fFee;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return date + " " + ticketNo + " " + size;
	}

}
