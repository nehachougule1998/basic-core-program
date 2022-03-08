package com.bridgelabz;
public class Triplet {
	public static boolean found;
    static void findTriplet(int[] array, int n) {
	        boolean found = true;
	         for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    if (array[i] + array[j] + array[k] == 0) {
	                        System.out.print(array[i]);
	                        System.out.print(" ");
	                        System.out.print(array[j]);
	                        System.out.print(" ");
	                        System.out.println(array[k]);
	                        found = true;
	                    }
	                }
	            }
	        }

	        if (found == false)
	            System.out.println(" not exist ");

	    }

	    public static void main(String[] args) {

	        int array[] = { 0, -1, 2, -3, 1 };
	        int n = array.length;
	        findTriplet(array, n);

	    }

	}
	




		        
		

