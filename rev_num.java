package day_1_1;

import java.util.Scanner;

public class rev_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,rev_num,rem;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		sc.close();
		rev_num=0;
		for(int i=1;a>0;i++) {
			rem=a%10;
			rev_num=rev_num*10+rem;
			a=a/10;
		}
		System.out.println("The reversed number is: "+rev_num);

	}

}
