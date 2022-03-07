package com.bridgelabz;
import java.util.Scanner;
public class Flip_coin {

	public static void main(String[] args) {
		System.out.println("welcome to basic core program");
	    Scanner no = new Scanner(System.in);  // create object

        System.out.println("Enter number ");

        int toss = no.nextInt();  // using nextInt() method
        int Heads = 0 , Tails = 0;
       
        
        // using for loop

        for (int i=0; i<toss; i++) {

            double flipcoin = Math.random();// using random method for random no

            if (flipcoin < 0.5) {
                System.out.println("Heads");
                Heads++;
            }
            else {
                System.out.println("Tails");
                Tails++;

            }
        }
          int Head = (Heads * 100)/toss;
          int Tail = (Tails * 100)/toss;
        System.out.println("Percentage Head : " +Head);
        System.out.println("Percentage Tail : " +Tail);
	}
}




