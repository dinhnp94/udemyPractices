package studentDatabase;

import java.util.Scanner;

public class Student {
	private String name;
	private int year;
	private String studentID;
	private int tuition = 0;
	private String[] courses = new String[5];
	private int pricePerCourse = 600;
	private static int id = 1000; //static so it will change
	
	//Constructor
	public Student() {
		System.out.print("First and Last Name: ");
		Scanner input = new Scanner(System.in);
		this.name = input.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n");
		System.out.print("Student Year: ");
		this.year = input.nextInt();
		
		setStudentID();
		
		
	}
	
	
//Generate ID
	private void setStudentID() {
		id++; //each time a student is created, id increases by 1
		this.studentID =  year + "" + id;//convert to String
	}
	
	
//Enroll courses
	public void enroll() {
		System.out.print("What courses do you want to enroll?\n");
		System.out.print("1 - History 101\n2 - Mathematics 101\n3 - English 101\n4 - Chemistry 101\n5 - Computer Science 101\n6 - Quit Enrolling\n");
		for (int i = 0; i < courses.length; i++) {
			Scanner input = new Scanner(System.in);
			int temp = input.nextInt();
			if (temp == 1) {
				System.out.print("Enrolled History 101\n");
				courses[i] = "History 101";
				this.tuition += pricePerCourse;
			}
			else if (temp == 2) {
				System.out.print("Enrolled Mathematics 101\n");
				courses[i] = "Mathematics 101";
				this.tuition += pricePerCourse;
			}
			else if (temp == 3) {
				System.out.print("Enrolled English 101\n");
				courses[i] = "English 101";
				this.tuition += pricePerCourse;
			}
			else if (temp == 4) {
				System.out.print("Enrolled Chemistry 101\n");
				courses[i] = "Chemistry 101";
				this.tuition += pricePerCourse;
			}
			else if (temp == 5) {
				System.out.print("Enrolled Computer Science 101\n");
				courses[i] = "Computer Science 101";
				this.tuition += pricePerCourse;
			}
			else {
				System.out.print("Quit Enrolling\n");
				break;
			}
		}
		
		
	}
	
	
//Check balance
	public void getTuition() {
		System.out.print("Tuition Balance: $" + this.tuition + "\n");
	}
	
	
//Pay tuition
	public void payTuition() {
		System.out.print("How much do you want to pay: $");
		Scanner input = new Scanner(System.in);
		int temp = input.nextInt();
		this.tuition -= temp;
		getTuition();
	}
	
	
//Status
	public void status() {
		System.out.print("\n");
		System.out.print("Name: " + this.name + "\n");
		System.out.print("Student ID: " + this.studentID + "\n");
		System.out.print("Courses Enrolled: \n");
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] != null) {
				System.out.print("	" + courses[i] + "\n");
			} else {
				break;
			}
		}
		System.out.print("Tuition Balance: " + this.tuition + "\n");
	}

} 