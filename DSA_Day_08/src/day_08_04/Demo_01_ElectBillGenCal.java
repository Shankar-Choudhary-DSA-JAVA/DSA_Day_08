package day_08_04;

import java.util.Scanner;

public class Demo_01_ElectBillGenCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Energy consumed:-");
		int consumptions = sc.nextInt();
		int bill;
		// done by me itself
		
		if(consumptions < 100) {
			bill = consumptions*5;
			System.out.println(bill);
		}
		
		else if(consumptions < 200) {
			bill = 100*5 + (consumptions-100)*7;
			System.out.println(bill);
		}
		else if(consumptions < 300) {
			bill= 100*5 + 100*2 + (consumptions-200)*10;
			System.out.println(bill);

		}else {
			bill= 100*5 + 100*7 + 100*10 +  (consumptions-300)*12;		
			System.out.println(bill);

		}
		
	}

}
