package java_examples;

import java.util.Scanner;

public class Dowhileloop {
	
	public static void printline() {
		int numberofasterisks = 50;
		while (numberofasterisks >= 0){   
		System.out.print("*");
		numberofasterisks--;
		
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		printline();
		// TODO Auto-generated method stub
		Scanner sccanner = new Scanner(System.in);
		int input;
		do {
		  System.out.println("enter a number (-1 to exit):  ");
		  input = sccanner.nextInt();
		  if (input <= 0) {
			  System.out.println("seems you are not interested");
		  }
		  else if (input%2 == 0) {
			  System.out.println("you entered an even number");
		  }
		  else {
			  System.out.println("you entered an odd number");
		  } 
		}
		while (input != -1); 
		
		  printline();
	}
}

