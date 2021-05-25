package day_1_1;

import java.util.Scanner;

public class prime_check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,count=0;
		System.out.println("Enter the number to check: ");
		a=sc.nextInt();
		sc.close();
		for(int i=1;i<a;i++) {
			if(a%i==0)
				count++;
			if(count==2)
				break;
		}
		if(count>=2)
			System.out.println("The entered number is not a prime number");
		else
			System.out.println("The entered number is a prime number");
	}

}
