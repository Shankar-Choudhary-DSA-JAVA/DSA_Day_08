package day_08_04;

import java.util.Scanner;

public class Demo_4_While {

	public static void main(String[] args) {
		
		// m1
		// even nos from 1 to n
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = n;
	        
	        while(i >= 1) { // this is cond
	        	// kya i , n se chhota hai , agar hai to print karo and then increase karo
	        	
	        	// but print those who are even
	        	if( i % 2 == 0) {
	        		
	        	System.out.println(i);
	        }
	        	i=i-1; // update conditions

	        	}
	        System.out.println("All even nos printed !");
	}
	

}
