package day_08_04;

import java.util.Scanner;

public class Demo_4_While2 {

	public static void main(String[] args) {
		
		// even nos from n to 1
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = n;
	        
	        while(i >= 1) { // this is cond
	        	
	        	// but print those who are even
	        	if( i % 2 == 0) {
	        		
	        	System.out.println(i);
	        }
	        	i=i-1;

	        	}
	        System.out.println("All even nos printed !");
	}
	

}
