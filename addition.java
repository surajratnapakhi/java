package day_1_1;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
//		int a,b,c;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the first number:");
//		a=sc.nextInt();
//		System.out.println("Enter the second number:");
//		b=sc.nextInt();
//		c=a+b;
//		System.out.println("The addition is: "+ c);
//----------program to add two characters
		char a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first character:");
		a = sc.next().charAt(0);
		System.out.println("Enter the second number:");
		b = sc.next().charAt(0);
		sc.close();
		System.out.println("Two characters are: " + a + b);

	}

}
