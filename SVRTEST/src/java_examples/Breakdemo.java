package java_examples;

public class Breakdemo {
	
	public static void main(String[] args) {
      int[] numbers = {1, 2, 4, 6, 8, 13, 16, 19, 24};
      int numbertobesearched = 25;
      for (int i = 0; i < numbers.length; i++) {
		if (numbers[i] == numbertobesearched ) {
			System.out.println("found");
			break;
		}
	}
	}

}
