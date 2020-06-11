package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private String gradeYear;
	private static String courseName = "";
	private static int studentId = 1000;
	private static int totalcost = 0;
	private int costOfCourse = 600;
	private static int dueBalance;
	Scanner sc = new Scanner(System.in);

	public Student() {
		// Scanner sc=new Scanner(System.in);
		System.out.println("enter the firstname and lastname");
		firstname = sc.next();
		lastname = sc.next();

		System.out.println("1 - freshman\n2- sophmore\n3-junior\n4-senior\nEnter the grade year");
		gradeYear = sc.next();
		SetStudentId();
		System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentId);
		enrollCourseName();
		System.out.println("the due amount is " + payTution());

	}

	private void SetStudentId() {

		int id = studentId++;
		System.out.println(gradeYear + " " + id);
	}
	// enroll coursers

	private void enrollCourseName() {
		// Scanner sc=new Scanner(System.in);
		System.out.println("enter the course name you want to put and Put f for finished");
		do {
			String course = sc.next();
			if (!course.equals("q")) {

				courseName = courseName + " " + course;
				totalcost = costOfCourse + totalcost;
			} else
				break;

		} while (1 != 0);
		System.out.println("the courses are " + courseName);
		System.out.println("total cost is " + totalcost);

	}

	private int payTution() {
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		dueBalance = totalcost - amount;

		return (dueBalance);
	}

	public void showInfo() {
		System.out.println(firstname + " " + lastname + "\n" + "studentId: " + studentId + "\n" + "courseName:"
				+ courseName + "\n" + "dueBalance:" + dueBalance);

	}

}
