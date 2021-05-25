package day_1_1;

import java.util.Scanner;

public class greatest_of_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,max;
		System.out.println("Enter the first number: ");
		a=sc.nextInt();
		System.out.println("Enter the second number: ");
		b=sc.nextInt();
		System.out.println("Enter the third number: ");
		c=sc.nextInt();
		sc.close();
		max=0;
		if(a>b)
			if(a>c)
				max=a;
		if(b>c)
			if(b>a)
				max=b;
		if(c>b)
			if(c>a)
				max=c;
		System.out.println("The greatest number is: "+max);
		
	}

}
