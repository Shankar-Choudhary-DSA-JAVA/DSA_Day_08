package day_08_04;

import java.util.Scanner;

public class Demo_12_SeriesOfFirstNterms {

	public static void main(String[] args) {
		
		// given a series of form 3i+1, you have to print first n terms
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 0; // initializations
	        int ans=0;
	        
	        while(i <= n) {	
	        	//System.out.println(3*i+1);
	        	ans =3*i+2;
		   	     System.out.println(ans);  // to print first n terms
		   	     i = i+1;
//	   	     System.out.println(ans);  // to print first n terms

	        }
//	     System.out.println(sum); // to print sum of n terms
	}

}
