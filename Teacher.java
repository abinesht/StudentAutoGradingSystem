

import java.util.ArrayList;

public class Teacher {
	private String name;
	private String password;
	
	public Teacher() {
		this.name = "sharu";
		this.password = "123";
	}
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public void insertStudentDetails(String name, ArrayList<Integer> studentMarksArr) {
		Student student = new Student(name, studentMarksArr);
		StudentAutoGradingSystem.studentArr.add(student);
	}
	
	public void addUser(String name, String password) {
		this.name=name;
		this.password=password;
	}
	
	public void addStudentUser(String name, String password) {
		Student s = new Student(name, password);
		StudentAutoGradingSystem.studentArr.add(s);
	}
	
	public void removeUser(Teacher teacher) {
		StudentAutoGradingSystem.teacherArr.remove(teacher);
	}
	
	public String grading(int d) {
		if (d>=75) {
			return "A";
		}else if (d>=65) {
			return "B";
		}else if (d>=55) {
			return "C";
		}else if (d>=35) {
			return "D";
		}else {
			return "F";
		}
	}
	
}
