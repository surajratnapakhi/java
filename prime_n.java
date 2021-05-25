package day_1_1;

import java.util.Scanner;

public class prime_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, count;
		count = 0;
		System.out.println("Enter the number:");
		a = sc.nextInt();
		sc.close();
		System.out.println("The prime numbers upto "+a+" are:");
		for (int i = 2; i <= a; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				if (i % j == 0)
					count++;
				if (count>2)
					break;
			}
			if (count <= 2)
				System.out.println(i);
			count=0;
		}

	}

}
