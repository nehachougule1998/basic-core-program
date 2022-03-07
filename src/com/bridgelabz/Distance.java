package com.bridgelabz;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		System.out.println("Enter the two point X & Y ");
		Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        double distance = Math.sqrt(x*x + y*y);
 
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);

	}

    }

