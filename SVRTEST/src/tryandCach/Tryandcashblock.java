package tryandCach;

public class Tryandcashblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2000;
		int b = 200;
		boolean c = a<b;
	
	    try {
	    	System.out.println(c);
		} catch (ArithmeticException e)  {
			// TODO: handle exception
			System.out.println("e");
		}  
       
	}

}
