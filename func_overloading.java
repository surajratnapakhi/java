package day_2;

import java.util.Scanner;

public class func_overloading {
	
	static void sum(int a,int b) {System.out.println("The addition is: "+(a+b));}
	static void sum(float a,float b) {System.out.println("The addition is: "+(a+b));}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		float x,y;
		System.out.println("Enter two integers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter two floats: ");
		x=sc.nextFloat();
		y=sc.nextFloat();
		sc.close();
		sum(a,b);
		sum(x,y);
		
	}

}
