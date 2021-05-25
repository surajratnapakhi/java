package day_1_1;

import java.util.Scanner;

public class compound_interest {

	public static void main(String[] args) {
		int year;
		float rate, principal, o_principal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		principal = sc.nextFloat();
		o_principal = principal;
		System.out.println("Enter the rate of interest:");
		rate = sc.nextFloat();
		System.out.println("Enter the duration of time:");
		year = sc.nextInt();
		sc.close();
		for (int i = 0; i < year; i++) {
			principal = principal + (principal * rate / 100);
		}
		o_principal = principal - o_principal;
		System.out.println("The compound interest will be:" + o_principal);
		System.out.println("The final amount will be:" + principal);

	}

}
