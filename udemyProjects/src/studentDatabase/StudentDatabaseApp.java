package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		System.out.print("How many new students will be added to the database? ");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] database = new Student[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) {
			database[i] = new Student();
			database[i].enroll();
			database[i].getTuition();
			database[i].payTuition();
			database[i].status();
		}
	}

}
