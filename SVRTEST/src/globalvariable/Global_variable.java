package globalvariable;

public class Global_variable {
	
	public String name = "webdriver";
	public static String toolname = "Selenium IDE";
	
	     public void method1 () {
	    	 System.out.println(name);
	    	 System.out.println(toolname);
	    	 
	    	 String tool = "remote control";
	    	 System.out.println(tool);
	     }

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Global_variable obj = new Global_variable();
		String val = obj.name;
		System.out.println("Instant Value  "+ val);
		
		//class value
		System.out.println("class value  "+toolname);
				
	
	}

}
