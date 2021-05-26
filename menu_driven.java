package day_2;

import java.util.Scanner;

public class menu_driven {
	static int t_bill = 0;

	static void bill(int a) {
		t_bill = t_bill + a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price, qnty, choice;
		choice = 0;
		System.out.println("1.pen");
		System.out.println("2.pencil");
		System.out.println("3.notebook");
		System.out.println("4.bottle");
		System.out.println("5.colourbox");
		System.out.println("6.done");
		while (choice != 6) {
			System.out.println("Enter the item code");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				price = 10;
				System.out.println("How many pens: ");
				qnty = sc.nextInt();
				bill(price * qnty);
				break;
			case 2:
				price = 5;
				System.out.println("How many pencils: ");
				qnty = sc.nextInt();
				bill(price * qnty);
				break;
			case 3:
				price = 20;
				System.out.println("How many notebooks: ");
				qnty = sc.nextInt();
				bill(price * qnty);
				break;
			case 4:
				price = 30;
				System.out.println("How many bottles: ");
				qnty = sc.nextInt();
				bill(price * qnty);
				break;
			case 5:
				price = 50;
				System.out.println("How many colourbox: ");
				qnty = sc.nextInt();
				bill(price * qnty);
				break;
			default:
				System.out.println("Thank you, visit again!");

			}

		}
		sc.close();
		System.out.println("The total bill will be: " + t_bill);

	}

}
