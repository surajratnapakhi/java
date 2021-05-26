package day_2;

import java.util.Scanner;

public class array_ops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int sum;
		System.out.println("Enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		sc.close();
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum of the entered elements is: " + sum);
		System.out.println("The avereage of them is: " + ((float)sum / a.length));
		for (int i = 0; i < 5; i++) {
			if (a[0] < a[i])
				a[0] = a[i];
		}
		System.out.println("The maximum number is: " + a[0]);
		for (int i = 0; i < 5; i++) {
			if (b[0] > b[i])
				b[0] = b[i];
		}
		System.out.println("The minimum number is: " + b[0]);
	}

}