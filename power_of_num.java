package day_1_1;

import java.util.Scanner;

public class power_of_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pow, o_num;
		System.out.println("Enter the number:");
		num = sc.nextInt();
		System.out.println("Enter the power:");
		pow = sc.nextInt();
		o_num = 1;
		for (int i = 0; i < pow; i++) {
			o_num = o_num * num;
		}
		System.out.println(pow + " power of " + num + " is : " + o_num);

	}

}
