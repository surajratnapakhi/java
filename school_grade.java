package day_2;

import java.util.Scanner;

public class school_grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roll_num,m1,m2,m3,m4,m5;
		float percent;
		String name;
		System.out.println("Enter the name of the student: ");
		name=sc.nextLine();
		System.out.println("Enter the roll number of the student: ");
		roll_num=sc.nextInt();
		System.out.println("Enter the marks of subject 1: ");
		m1=sc.nextInt();
		System.out.println("Enter the marks of subject 2: ");
		m2=sc.nextInt();
		System.out.println("Enter the marks of subject 3: ");
		m3=sc.nextInt();
		System.out.println("Enter the marks of subject 4: ");
		m4=sc.nextInt();
		System.out.println("Enter the marks of subject 5: ");
		m5=sc.nextInt();
		sc.close();
		
		percent=(m1+m2+m3+m4+m5)/5;
		System.out.println("Percentage of " +name+ " with roll number "+roll_num+" are :");
		System.out.println(percent);
		if(percent>75) {
			System.out.println("The grade is: A");
		}
		else if(percent<74 && percent>60) {
			System.out.println("The grade is: B");
		}
		else if(percent<59) {
			System.out.println("The grade is: C");
		}
	}

}