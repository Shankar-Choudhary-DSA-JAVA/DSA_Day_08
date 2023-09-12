package day_08_04;

import java.util.Scanner;

public class Demo_10_SumOfEvenNos2 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 1;
	        int ans = 0;
	        
	        while(i <= n) {
	        	if(i % 2 != 0)
	        	
	        	ans = ans + i;
	        	i = i+2;
	        }
	     
             System.out.println(ans);
	}

}
