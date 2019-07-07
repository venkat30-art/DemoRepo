package java_examples;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

public class Forloopstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] array = {1, 2, 3, 4, 5, 6};
		//for(int item : array ) {
			//System.out.println(item);
		//}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
