package day_08_04;

import java.util.Scanner;

public class Demo_13_SeriesOfFirstNterms2 {

	public static void main(String[] args) {
		
		// given a series of form 3i+1, you have to print first n terms(any how) except the multiples of 5
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 0; // initializations
	        int ans=0;
	        
	        while(i <= n) {	
	        	// this is wrong because we got only 5 terms but we need 7 terms
	        	// means the terms that we missed for that we need additional terms
		   	     ans =3*i+2;

	        	if(ans % 5 != 0) { // ans should not be the multiples of 5
			   	     System.out.println(ans);  // to print first n terms

	        	}
		   	     i = i+1;


	        }
        // System.out.println(sum); // to print sum of n terms
	}

}
