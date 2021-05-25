package day_1_1;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, num_len, c_num, rem, sum, f_num;
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		sc.close();
		num_len = 0;
		f_num = 0;
		sum = 1;
		c_num = a;
		for (int i = 1; a > 0; i++) {
			num_len = num_len + 1;
			a /= 10;
		}
		a = c_num;
		for (int i = 0; i < num_len; i++) {
			rem = a % 10;
			a = a / 10;
			for (int j = 0; j < num_len; j++) {
				sum = sum * rem;
			}
			f_num = f_num + sum;
			sum = 1;
		}
		if (f_num == c_num)
			System.out.println("Given number is an armstrong number");
		else
			System.out.println("Given number is not an armstrong number");
	}

}
