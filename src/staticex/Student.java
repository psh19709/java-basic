package staticex;

public class Student {

	public static int serialNum = 1000;
	public int studentiD;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
