package day_08_04;

import java.util.Scanner;

public class Demo_14_SeriesOfFirstNterms3 {

	public static void main(String[] args) {
		
		// given a series of form 3i+1, you have to print first n terms except the multiples of 5
		
		   Scanner sc = new Scanner(System.in);
	        System.out.println(" Enter the numbers : ");
	        int n =sc.nextInt();
	        int i = 1 ; // initializations
	        int valid_Terms1=0;
	        
	        while(valid_Terms1 < n) {	
	        	// this is wrong because we got only 5 terms but we need 7 terms
	        	// means the terms that we missed for that we need additional terms
		   	    int val =3*i+2;

	        	if(val % 5 != 0) { // ans should not be the multiples of 5
			   	     System.out.println(val);  // to print first n terms
          valid_Terms1=valid_Terms1+1;
	        	}
		   	     i = i+1;


	        }
        // System.out.println(sum); // to print sum of n terms
	}

}
