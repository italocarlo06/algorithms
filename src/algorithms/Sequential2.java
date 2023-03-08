package algorithms;

import java.util.Scanner;

class Sequential2 {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
	    System.out.println("Enter Grade 1:");	    
	    int grade1 = myObj.nextInt(); //Read Grade1
	    System.out.println("Enter Grade 1:");	    
	    int grade2 = myObj.nextInt(); //Read Grade1
	    System.out.println("Enter Grade 1:");	    
	    int grade3 = myObj.nextInt(); //Read Grade3
	    System.out.println("Enter Grade 4:");	    
	    int grade4 = myObj.nextInt(); //Read Grade4
	    
	    
	    myObj.close(); // close scanner object
	    
	    double average = (grade1+grade2+grade3+grade4)/4; //calculate avg of
	    
	    System.out.println("Average is: \t" + average);  // print avg	    
	    if (average >= 60)
	    	System.out.println("Passed!");
	    else
	    	System.out.println("Failed!");
	    	
	    System.out.println(average >= 60 ? "Passed" : "Failed");
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
	    
	    int x = 6 ,y = 5;
	    
	    if (x > 5) {
	    	if (y > 5)
	    		System.out.println("x and y are > 5");
	    }
	    else
	    	System.out.println("x is <= 5");
	  }
}





