package com.bridgelabz;
import java.util.Scanner;
public class Swap_two_no {

	public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in); // create scanner class object

	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        System.out.println("Numbers before swaping");  //before swaping 10 20
	        System.out.println(num1);
	        System.out.println(num2);

	        int swap1 = num2;
	        int swap2 = num1;

	        System.out.println("Numbers after swaping"); //after swaping 20 10
	        System.out.println(swap1);
	        System.out.println(swap2);
	    }
	}

	
