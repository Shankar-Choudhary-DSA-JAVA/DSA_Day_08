package day_08_04;

import java.util.Scanner;

public class Demo_8_factorials2 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = n;
	        int ans =1;
	        
	        while(i >= 1) {
	        	ans=ans*i;
	        	i=i-1;
	        }
	        // last result we want to print
        	System.out.println(ans);

	}

}
