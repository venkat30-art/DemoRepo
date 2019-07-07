package java_examples;

public class Javabasictest {
	int a;
	int b;
 
	public void setdata (int a, int b) {
		a = a;
		b = b ;
	}
	public void showdata () {
		System.out.println("value of A=" +a);
		System.out.println("value of B=" +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javabasictest obj1 = new Javabasictest();
		obj1.setdata(2,3);
		obj1.showdata();
		

	}

}
