

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StudentAutoGradingSystem {
	
	static ArrayList<Teacher> teacherArr = new ArrayList<>();
	static ArrayList<Student> studentArr = new ArrayList<>();
	
	public static void main(String[] args) {
        boolean exit=false;
        
        mainMenu:
        while(!exit) {
			System.out.println("1 - Teacher login");
			System.out.println("2 - Student login");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("choice: ");
			int choice = scanner.nextInt();
	
			switch(choice) {
			case 1:
				Teacher teacher = new Teacher();
				teacherArr.add(teacher);
				
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("\nEnter username: ");
				String userName = scanner2.nextLine();
				
				System.out.print("Enter password: ");
				String password = scanner2.nextLine();
			
				
				for (Teacher t : teacherArr) {
					if ((t.getName()).equals(userName) && (t.getPassword()).equals(password)) {
						System.out.println("\nSuccessfully logged in........!");
						
						teacherMenu:
							while(!exit) {
	
							System.out.println("\n1 - Add a new teacher user");
							System.out.println("2 - Remove a teacher user");
							System.out.println("3 - Add a new student user");
							System.out.println("4 - Insert student details");
							System.out.println("5 - Find high mark holder in each subject");
							System.out.println("6 - Print student’s report");
							System.out.println("7 - Print whole students grade with details");
							System.out.println("8 - Go to main menu");
							System.out.println("9 - Exit");
							
							System.out.print("\nChoice: ");
							int choice2 = scanner2.nextInt();
	
							switch(choice2) {
							case 1:
								Scanner scanner3 = new Scanner(System.in);
								System.out.print("\nEnter username: ");
								String userName2 = scanner3.nextLine();
								
								System.out.print("Enter password: ");
								String password2 = scanner3.nextLine();
								
								Teacher teacher2 = new Teacher();
								teacher2.addUser(userName2, password2);
								teacherArr.add(teacher2);
								System.out.println("\nSuccessfully Teacher User Added........!\n");
								continue teacherMenu;
							
							case 2:
								Scanner scanner4 = new Scanner(System.in);
								System.out.print("\nEnter username: ");
								String userName3 = scanner4.nextLine();
								
								for (Teacher x : teacherArr) {
									if ((x.getName()).equals(userName3)){
										x.removeUser(x);
									}
								}
								System.out.println("\nSuccessfully Teacher User Removed........!\n");
								continue mainMenu;
							case 3:
								Scanner scanner8 = new Scanner(System.in);
								System.out.print("\nEnter username: ");
								String userName5 = scanner8.nextLine();
								
								System.out.print("Enter password: ");
								String password5 = scanner8.nextLine();
								
								Teacher teacher4 = new Teacher();
								teacher4.addStudentUser(userName5, password5);
								System.out.println("\nSuccessfully Student User Added........!\n");
								continue teacherMenu;	
							case 4:
								Scanner scanner5 = new Scanner(System.in);
								System.out.print("Enter students total number : ");
								int stu_number = scanner5.nextInt();
								
								System.out.print("Enter subjects total number: ");
								int sub_number = scanner5.nextInt();
								
								for (int i=0; i<stu_number; i++) {
									System.out.print("Enter student name: ");
									String name=scanner5.next();
									
									ArrayList<Integer> studentMarkArr = new ArrayList<>();
									for (int j=1;j<=sub_number; j++) {
										System.out.print("Enter mark for subject "+j +": ");
										int mark=scanner5.nextInt();
										studentMarkArr.add(mark);
									}
	
									Teacher teacher3 = new Teacher();
									teacher3.insertStudentDetails(name, studentMarkArr);
								}
								for (Student i:studentArr) 
									i.findTotal();
								
								System.out.println("\nStudent details successfully Added........!\n");
								continue teacherMenu;
								
							case 5:
								for (int j=0; j<(studentArr.get(0)).getStudentMarksArr().size(); j++) {
									int highest=0;
									String highestholder = "";
									for (Student i:studentArr) {
										if ((i.getStudentMarksArr()).get(j)>highest) {
											highest=(i.getStudentMarksArr()).get(j);
											highestholder = i.getName();
										}
									}
									System.out.println("Highest mark in subject "+(j+1) +" is : "+highest+" for "+ highestholder);		
								}
	
								continue teacherMenu;
							case 6:
								Scanner scanner6 = new Scanner(System.in);
								System.out.print("Enter student's name : ");
								String stu_name = scanner6.next();
								
								for (Student k:studentArr) {
									
									if (k.getName().equals(stu_name)) {
										for (int i=0; i<k.getStudentMarksArr().size(); i++ ){
											Teacher teacher3 =new Teacher();
											System.out.println("Marks and Grade for subject "+ (i+1)+" is : " +k.getStudentMarksArr().get(i)+","+ teacher3.grading(k.getStudentMarksArr().get(i)));
										}										
										System.out.println("Total marks is : "+k.getTotal());
										System.out.println("Average is : "+k.getAverage());
										System.out.println("Rank is : "+k.getRank()+"\n");
										
									}
								}
								continue teacherMenu;
							case 7:
								for (Student k:studentArr) {
									System.out.println("\nStudent name is :\t"+k.getName());
									for (int i=0; i<k.getStudentMarksArr().size(); i++ ){
										Teacher teacher3 =new Teacher();
										System.out.println("Marks and Grade for subject "+ (i+1)+" is :\t " +k.getStudentMarksArr().get(i)+","+ teacher3.grading(k.getStudentMarksArr().get(i)));
									}
								}
								continue teacherMenu;
							case 8:
								continue mainMenu;
							case 9:
								exit=true;
								continue mainMenu;

							}
						}
				}
			}
			System.out.println("\nIncorrect login.....!\nplease try again.....!\n");
			break;
			
		case 2:
			Student student = new Student();
			studentArr.add(student);
			
			Scanner scanner7 = new Scanner(System.in);
			System.out.print("\nEnter username: ");
			String userName4 = scanner7.nextLine();
			
			System.out.print("Enter password: ");
			String password4 = scanner7.nextLine();
			
			
			for (Student s : studentArr) {
				try {
					if ((s.getName()).equals(userName4) && (s.getPassword()).equals(password4)) {
						System.out.println("\nSuccessfully logged in........!\n");
						
						studentMenu:
						while(!exit) {
							System.out.println("1 - Print your details");
							System.out.println("2 - Go to main menu");
							System.out.println("3 - Exit");
							
							System.out.print("\nChoice: ");
							int choice3 = scanner7.nextInt();

							switch(choice3) {
							case 1:
								for (Student s2 : studentArr) {
									try {
										if ((s2.getName()).equals(userName4)) {
											for (int i=0; i<s2.getStudentMarksArr().size(); i++ ){
												Teacher teacher4 =new Teacher();
												System.out.println("Marks and Grade for subject "+ (i+1)+" is : " +s2.getStudentMarksArr().get(i)+","+ teacher4.grading(s2.getStudentMarksArr().get(i)));
											}										
											System.out.println("Total marks is : "+s2.getTotal());
											System.out.println("Average is : "+s2.getAverage());
											System.out.println("Rank is : "+s2.getRank()+"\n");
											break;
										}
									} catch (NullPointerException e) {
										continue;
									}
		
								}
								continue studentMenu;
							case 2:
								continue mainMenu;
							case 3:
								exit=true;
								continue mainMenu;
							}
						}
					}
				} catch (Exception e) {
					continue;
				}

			}
			System.out.println("\nIncorrect login.....!\nplease try again.....!\n");
			break;
		default:
          System.out.println("incorrect input !!!!!!!!!!!");
          break;
		}
		
        }
        System.out.println("\nProgram Successfully Ended !!!!!!!!!!!");
	}

}
