package day_08_04;

import java.util.Scanner;

public class Demo_3_While3 {

	public static void main(String[] args) {
		
		// methods 1
		// n to 1
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = n;
	        
	        while(i >= 1) {
	        	System.out.println(i);
	        	i=i-1;
	        }
	}

}
