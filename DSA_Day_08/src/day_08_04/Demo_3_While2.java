package day_08_04;

import java.util.Scanner;

public class Demo_3_While2 {

	public static void main(String[] args) {
		
		// 1 to n
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 1;
	        
	        while(i <=n) {
	        	System.out.println(i);
	        	i=i+1;
	        }
	}

}
