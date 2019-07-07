package java_examples;

public class Test_02 {
         //state of an employe
	   String name;
	   int age;
	   //construction. we have an employee e =new employee("joe", 30);
	   public Test_02 (String name, int age) {
		   this.name =name;
		   this.age = age;
		   
	   }
	    
	   //behavior of employee
	   public void greet() {
		   System.out.println("good morning  "+ name);
	   }
	   public void work() {
		   System.out.println(name + "  work");
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create joe object
		Test_02 joe = new Test_02("joe", 30);
		//create mike object
		Test_02 mike = new Test_02("mike", 25);
		//ask to greet
		joe.greet();
		mike.greet();
		
		//ask them to work
		joe.work();
		mike.work();

	}
}

