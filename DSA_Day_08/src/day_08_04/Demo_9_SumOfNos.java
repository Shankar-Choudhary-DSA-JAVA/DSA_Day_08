package day_08_04;

import java.util.Scanner;

public class Demo_9_SumOfNos {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 0;
	        int ans = 0;
	        
	        while(i <= n) {
	        	
	        	ans = ans + i;
	        	i = i+1;
	        }
	     
             System.out.println(ans);
	}

}
