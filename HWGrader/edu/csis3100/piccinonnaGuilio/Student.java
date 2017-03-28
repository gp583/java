import java.util.ArrayList;

public class Student {

	static ArrayList <Student> students  = new ArrayList <Student>();
	public	String name;
	public	String assignment;
	public 	String grade;

	public String getAssignment() {
		return assignment;

	}
	public String getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Student(String n){
		name = n;
	}
	
	public Student(String n, String a, String g) {
		name = n;
		assignment = a;
		grade = g;
	}

	public void assignGrade(String assignGr){
		grade = assignGr;
	}

	public void submitAssignment(String subAssign){
		assignment = subAssign;
	}
	
	
	public static void test(){
		Student stud1 = new Student("Jim");
		stud1.assignGrade("B");
		stud1.submitAssignment("This is my first assignment");
		System.out.println("The grade " + stud1.name + " received on his first assignment, " +  stud1.getAssignment() + ", is a " +
				stud1.getGrade() + ".");
	}

	public static void main(String[] args){
		test();
	}
}
