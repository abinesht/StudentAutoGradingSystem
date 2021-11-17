

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private String password;
	private ArrayList<Integer> studentMarksArr = new ArrayList<>();
	private int total;
	private int rank;
	private double average;
	static ArrayList<Integer> totalArr = new ArrayList<>();
	
	public Student() {
		name="abi";
		password="456";
	}
	
	public Student(String name, String password) {
		this.name=name;
		this.password=password;
	}
	
	public Student(String name,  ArrayList<Integer> studentMarksArr) {
		this.name=name;
		this.studentMarksArr=studentMarksArr;
	}
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}

	public void findTotal() {
		total=0;
		for (int i=0; i<studentMarksArr.size(); i++) {
			total=total+studentMarksArr.get(i);
		}
		totalArr.add(total);
	}
	
	public int getTotal() {
		return total;
	}
	
	public double getAverage() {
		average=total/(studentMarksArr.size());
		return average;
	}
	
	public ArrayList<Integer> getTotalArr(){
		Collections.sort(totalArr);
		Collections.reverse(totalArr);
		return totalArr;
	}
	
	public int getRank() {
		rank=getTotalArr().indexOf(total)+1;
		return rank;
	}
	
	public ArrayList<Integer> getStudentMarksArr(){
		return studentMarksArr;		
	}
	

}
