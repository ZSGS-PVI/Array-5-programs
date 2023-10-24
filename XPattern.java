package ArraysProblems;

import java.util.Scanner;

public class XPattern {
	
	public static void pattern(String str) {
	
		if(str.length()%2!=0) {
		
	    for(int i=0;i<str.length();i++) {
	    	
	    	 for(int j=0;j<str.length();j++) {
	    		 
	    		 if((i==j) || (i+j==str.length()-1)){
	    			 
	    			 System.out.print(str.charAt(j));
	    		 }
	    		 else {
	    		 	 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
		}
		
		else {
			System.out.println(0);
		}
		
	}
	
	public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);

    System.out.println("Enter the string you want:");//PROGRAM
    
   String str=in.next();
   
   pattern(str);
     
}
}
