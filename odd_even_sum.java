package day_1_1;

import java.util.Scanner;

public class odd_even_sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,e_sum,o_sum;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		sc.close();
		e_sum=0;
		o_sum=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0)
				e_sum=e_sum+i;
			else
				o_sum=o_sum+i;
		}
		System.out.println("The sum of even numbers:"+e_sum);
		System.out.println("The sum of odd numbers:"+o_sum);

	}

}
