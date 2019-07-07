package java_examples;

public class Numberofcharacters {
	
	public static void main(String[] args) {
	
		// number of characters count
		String string = "welcome java welcomes to india";
		int numberofos = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'e'){
			numberofos++;
			continue;
			
			
			}
				
				
	}
      System.out.println("number of os  " + numberofos);
  }
}
