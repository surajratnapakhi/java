package day_2;

import java.util.Scanner;

public class array_match {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		int b,i,x=0;
		System.out.println("Enter number:");
		b=sc.nextInt();
		for(i=0;i<5;i++) {
			if(a[i]==b) {
				x=1;
				break;
			}
		}
		if(x==1)
			System.out.println("There is a match is at index: "+i);
		else
			System.out.println("There is no match");
			
	}
		

}