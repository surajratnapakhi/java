package day_1_1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int o_num, c_num, rem, f_num;
		System.out.println("Enter the number:");
		o_num = sc.nextInt();
		sc.close();
		c_num = o_num;
		f_num = 0;
		while (o_num != 0) {
			rem = o_num % 10;
			f_num = f_num * 10 + rem;
			o_num = o_num / 10;
		}
		if (c_num == f_num)
			System.out.println("The entered number is palindrome");
		else
			System.out.println("The entered number is not a palindrome");
	}

}
