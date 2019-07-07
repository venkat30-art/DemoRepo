package java_examples;

public class Test_01 {
    public static int addtwonumbers (int firstnumber, int secondnumber, int thirdnumber) {
    	int sum = firstnumber + secondnumber * thirdnumber;
     	return sum;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = addtwonumbers(2,5, 3);
		System.out.println(sum);

	}

}
