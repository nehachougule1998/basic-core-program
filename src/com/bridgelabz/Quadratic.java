package com.bridgelabz;
import java.util.Scanner;
public class Quadratic {

	

	public static void main(String[] args) {
		double rootone = 0;
		double roottwo = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a = input.nextInt();
		System.out.println("Enter the value of b :");
		double b = input.nextInt();
		System.out.println("Enter the value of c :");
		double c = input.nextInt();
		
		double determinant = b*b-4*a*c;
		double sqrt = Math.sqrt(determinant);
		if(determinant>0) {
			rootone = (-b + sqrt)/(2*a);
			roottwo = (-b - sqrt)/(2*a);
			System.out.println("Roots are "+rootone+" "+roottwo);	
		}
		else if(determinant == 0) {
			System.out.println("Root is :" +(-b + sqrt)/(2*a));
		}
	}

}
