package day_2;

import java.util.Scanner;

public class rev_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the five numbers: ");
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The entered numbers in reverse order are:");
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}