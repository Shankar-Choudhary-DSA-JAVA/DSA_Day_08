package day_08_04;

import java.util.Scanner;

public class Demo_6_MultiOfTwos {

	public static void main(String[] args) {
		
		// methods 2
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 2; // for even take gap 2
	        
	        while(i <= n) {
	        	System.out.println(i);
	        	i=i+2; // its better because loop is running less than first one
	        	// fasters
	        }
	}

}
