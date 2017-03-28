//Guilio Piccinonna
//11-12-14
//in class assignment

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Date dob = new Date(1,9,1984);
		Date start = new Date(04,23,2002);
		
		Employee Employ1 = new Employee ("Alex", "Janitor", dob, 10, start);
		dob = new Date(4,4,1980);
		start = new Date(5,25,2003);
		Employee Employ2 = new Employee ("Artie", "Longshoreman", dob, 10, start);
		
		System.out.println(Employ1);
		System.out.println(Employ2);
	
	}

}

/*Employee Alex was born on 1-9-1984 is a Janitor and has been working for 10 years since 4-23-2002.
Employee Artie was born on 4-4-1980 is a Longshoreman and has been working for 10 years since 5-25-2003.
*/