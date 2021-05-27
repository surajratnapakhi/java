package day_3;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,temp;
		System.out.println("Enter the length of the array: ");
		a=sc.nextInt();
		
		int[] arr=new int[a];
		
		System.out.println("Give elements for the array: ");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The array in ascending order: ");
		for(int i:arr) {
			System.out.print(" "+i);
		}
//		for(int i=0;i<a;i++) {
//			System.out.println(arr[i]);
//		}

	}

}

// hi this is testing of git push
