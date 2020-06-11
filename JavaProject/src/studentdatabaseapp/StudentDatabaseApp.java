package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the students to be enrolled");
		int number=sc.nextInt();
		Student[] s=new Student[number];
		for(int i=0;i<s.length;i++) {
			Student s1=new Student();
			//Student s2=new Student();
			s1.showInfo();
		}
		
		

	}

}
