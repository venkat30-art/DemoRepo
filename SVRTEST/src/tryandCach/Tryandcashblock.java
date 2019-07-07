package tryandCach;

public class Tryandcashblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 300;
		int b = 2000;
		boolean c = a>b;
	
	    try {
	    	
			System.out.println("a is big number  " +   c );
		} catch (ArithmeticException e)  {
			// TODO: handle exception
			System.out.println("B is a small number  " +   e);
		}  
       
	}

}
