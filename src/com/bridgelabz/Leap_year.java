package com.bridgelabz;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		System.out.println("enter a year");
		Scanner SC = new Scanner(System.in);
		int a = SC.nextInt();
		if (a%100 == 0 && a%400 ==0 || a%100 != 0 && a%4 == 0 )
			System.out.println("leap year");
		else
			System.out.println("not leap year");
		
	}

}
