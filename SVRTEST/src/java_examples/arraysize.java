package java_examples;

import java.util.Scanner;

public class arraysize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of an array");
		int arraysize = scanner.nextInt();
		
		int[] array = new int[arraysize];
		System.out.println("the size of the array  " +  arraysize);
		
			
		
	}

}
