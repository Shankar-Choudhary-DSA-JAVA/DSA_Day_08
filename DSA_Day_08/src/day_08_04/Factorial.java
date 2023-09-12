package day_08_04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose factorial you want to find");
		int n = sc.nextInt();
		int fact = 1;
		
		while(n>0) {
			fact *=n;
			n--;
		}
		
		System.out.println("Factorial is " + fact);
	}

}
