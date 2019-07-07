package java_examples;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a month number :  ");
		int monthnumber = scanner.nextInt();
		String month = null;

		
		if (monthnumber == 1) {
			month = "quarter1";
		}
		else if (monthnumber == 2) {
			month = "quarter2";
		}
		else {
			month = "unknown";
		}

		System.out.println("ok this month quater : " + month);
	}

}
