import java.util.*;

public class Teacher {
	
	static ArrayList <Student> students  = new ArrayList <Student>(); 

	public static String getAssignmentByName(String findName) throws studentNotFoundException{
		for(int i = 0; i < students.size(); i++){
			if (findName.equals(students.get(i).name))
				return students.get(i).assignment;
		}
		throw new studentNotFoundException("Student not Found!");
	}
	public static void assignGradebyName(String assignName, String theGrade) throws studentNotFoundException{
		int i;

		for(i = 0; i < students.size(); i++){
			if (assignName.equals(students.get(i).name)){
				students.get(i).assignGrade(theGrade);
				break;
			}
		}
		if (i == students.size()) 
			throw new studentNotFoundException(assignName + " not Found!");
	}
	public static void submitAssignbyName(String assignName, String theAssign) throws studentNotFoundException{
		int i;

		for(i = 0; i < students.size(); i++){
			if (assignName.equals(students.get(i).name)){
				students.get(i).submitAssignment(theAssign);
				break;
			}
		}
		if (i == students.size()) 
			throw new studentNotFoundException(assignName + " not Found!");
	}
	
	public static String getGradeByName(String findName) throws studentNotFoundException{
		for(int i = 0; i < students.size(); i++){
			if (findName.equals(students.get(i).name))
				return students.get(i).grade;
		}
		throw new studentNotFoundException("Student not Found!");
	}
	
	public void addStudent(String studName){
		students.add(new Student(studName));
	}

	public static void test(){
		Teacher Rajput = new Teacher();
		
		try{
			String subAssign = "This is assignment one";
			students.add(new Student("James"));
			students.add(new Student("Samantha"));
			students.add(new Student("Roberta"));
			students.add(new Student("Cameron"));
			students.add(new Student("Giulio"));
			students.get(0).submitAssignment(subAssign);
			assignGradebyName("Giulio", "A");
			assignGradebyName("Jim", "B");
		}catch (studentNotFoundException e)
		{}
		System.out.println(Rajput.students.get(1).getName() + " has a grade of " + Rajput.students.get(1).getGrade());
	}

	public static void main(String[] args){
		test();
	}
}
