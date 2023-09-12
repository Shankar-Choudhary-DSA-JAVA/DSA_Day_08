package day_08_04;

import java.util.Scanner;

public class Demo_7_factorials {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 1;
	        int ans =1;
	        
	        while(i <= n) {
	        	ans=ans*i;
	        	//i=i+1;//or
	        	i++;
	        }
	        // last result we want to print
        	System.out.println(ans);

	}

}
