package day_1_1;

import java.util.Scanner;

public class sum_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,sum;
		System.out.println("Enter the number: ");
		a=sc.nextInt();
		sc.close();
		sum=0;
		for (int i=0;i<=a;i++) {
			sum=sum+i;
		}
		
		System.out.println("The sum is: "+sum);
	}

}
