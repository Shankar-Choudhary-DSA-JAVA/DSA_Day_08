package day_08_04;


import java.util.Scanner;

public class Demo_2_While {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Calories you want to burns :  ");
        int a =sc.nextInt();
        int cal = 0;


        while(cal <= a){
            System.out.println("Runs 1 steps and burned calorie is : " +(cal+1) );
            cal=cal+1;


        }
        System.out.println("Target acieved take rest");
	}

}
