package day_08_04;

import java.util.Scanner;

public class Demo_5_While4 {

	public static void main(String[] args) {
		
		
		// print powers of 2 between 1 to 100
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i =2;
	        
	        while(i <= n) {
	        	System.out.println(i);
		        	i=i*2;

	        	}
	}	       

}
