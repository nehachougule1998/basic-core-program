package com.bridgelabz;
public class Twodimentional {
	public static void main(String[] args) {
			int array[][] = new int [2][2];
			for(int m=0; m<2; m++) 
			{
				for(int n=0; n<2; n++)
				{
					array[m][n] = (int)( Math.random()*100);
				
				}
			}	
			System.out.println("2D Array");
			for(int m=0; m<2; m++)                   
			{
				for(int n=0; n<2; n++)              
				{
					System.out.print(array[m][n] +" ");
				}
				System.out.print("\n");
		    }
			
	    }

	}
	
