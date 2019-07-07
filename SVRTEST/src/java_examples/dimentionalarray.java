package java_examples;

public class dimentionalarray {
	public static void main(String[] args) {
		//multidimentionalarray
		int[][] matrix = {
				
				{1, 0, 1},
				{1, 1, 0},
				{0, 1, 1}
		};
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "  ");
				
			}
			System.out.println();
		}
	}

}
