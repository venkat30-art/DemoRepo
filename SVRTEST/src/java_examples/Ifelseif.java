package java_examples;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   System.out.println("enter a month number :");
   int monthnumber = scan.nextInt();
   String month = null;
       
        if (monthnumber == 1) {
			month = "quarter1";
		   } 
          else if (monthnumber == 2){
            month = "quarter1";
		  }
		  else if (monthnumber == 3) {
			  month = "quarter1";
		  } 
		  else if (monthnumber == 4) {
			  month = "quarter2";
		  }
		  else if (monthnumber == 5) {
			  month = "quarter2";
		  }
		  else if (monthnumber == 6) {
			  month = "quarter2";
		  }
		  else if (monthnumber == 7) {
			  month = "quarter3";
		  }
		  else if (monthnumber == 8) {
			  month = "quarter3";
		  }
		  else if (monthnumber == 9) {
			  month = "quarter3";
		  }
		  else if (monthnumber == 10) {
			  month = "quarter4";
		  }
		  else if (monthnumber == 11) {
			  month = "quarter4";
		  }
		  else if (monthnumber == 12) {
			  month = "quarter4";
		  }
   else {
	    	month = "unknown";
	    } 
        System.out.println("this month quarter :"+  month);
        
	}

}
