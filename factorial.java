package day_1_1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,fact;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		sc.close();
		fact=1;
		for(int i=1;i<=a;i++) {
		fact=fact*i;
		}
		System.out.println("The factorial of the given number is: "+fact);
	}

}
