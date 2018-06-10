package week3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ClassMaxValueArray {

	public static void main(String[] args) {
		
//			//declare attributes:
//			Integer[] intArray = {20, 340, 27, 879, 27, 457, 8546, -258}; 
//
//			//Find the 2nd largest using:
//			Arrays.sort(intArray, Collections.reverseOrder());
//			System.out.println("Second largest Array value is: "+intArray[1]);
			
		int [] arr= {20,340,2256361,879,92,21,474,8367,-200000};
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}