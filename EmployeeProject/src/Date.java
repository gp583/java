
public class Date {
		private int month;
		private int day;
		private int year;
		
		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}


		public int getDay() {
			return day;
		}


		public void setDay(int day) {
			this.day = day;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}

public Date (int d, int m, int y){
	day = d;
	month = m;
	year = y;
}

public String toString() {
	return day + "-" + month + "-" + year;
}
}

