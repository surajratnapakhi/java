package day_2;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal;
		double t_sal=0;
		System.out.println("Enter the basic salary: ");
		sal=sc.nextInt();
		sc.close();
		if(sal<=10000) {
			t_sal=sal + (sal*0.20)+(sal*0.80);
		}
		else if(sal>10000 && sal<=20000) {
			t_sal=sal + (sal*0.25)+(sal*0.90);
		}
		else if(sal>20000) {
			t_sal=sal + (sal*0.30)+(sal*0.95);
		}
		System.out.println("The total salary will be: " + t_sal );
	}
}
