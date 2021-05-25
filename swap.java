package day_1_1;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		sc.close();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping first number :"+a+" and the second number: "+b);
		
	
	}

}
