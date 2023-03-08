package algorithms;

import java.util.Scanner;

public class SequentialWithWhile {
	public static void main(String[] args) {
		   Scanner myObj = new Scanner(System.in);
		   int option = 1;
		   
		   while(option != 0) {			   
			   System.out.println("Menu");
			   System.out.println("1-Type Student Grades");
			   System.out.println("0-Exit");
			   
			   option = myObj.nextInt();
			   
			   if (option != 1){
				   System.out.println("Enter Grade 1:");	    
				   int grade1 = myObj.nextInt(); //Read Grade1
				   System.out.println("Enter Grade 2:");	    
				   int grade2 = myObj.nextInt(); //Read Grade1
				   System.out.println("Enter Grade 3:");	    
				   int grade3 = myObj.nextInt(); //Read Grade3
				   System.out.println("Enter Grade 4:");	    
				   int grade4 = myObj.nextInt(); //Read Grade4
				 				   
		    
				   double average = (grade1+grade2+grade3+grade4)/4;
				  		   		   
				   if (average >=60)
					   System.out.println("Passed!");
				   else
					   System.out.println("Failed!");
				   
				   if (average >= 90)
				    	System.out.println("A");
				    else
				    	if (average >= 80)
				    		System.out.println("B");
				    	else
				    		if (average >= 70)
				    			System.out.println("C");
				    		else
				    			if (average >= 60)
				    				System.out.println("D");
				    			else
				    				System.out.println("F");
				    
				   System.out.println("Average is: \t" + average);
				   System.out.println();
			   }
		   }
		   myObj.close(); // close scanner object
		   
		   	    
	   }
}



