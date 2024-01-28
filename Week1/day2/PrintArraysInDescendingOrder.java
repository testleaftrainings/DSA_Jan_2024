package week1.day2;

import java.util.Arrays;

public class PrintArraysInDescendingOrder {
public static void main(String[] args) {
	
	//Initialize an Array
	int[] number= {7,4,3,6,1,2,8,9,5};
	//output 9,8,7,6,5,4,3,2,1
	
	//sort the given using Arrays.sort()
	Arrays.sort(number);
	
	//System.out.println(Arrays.toString(number));
	
	//use reverse for loop to print values in descending order
	for(int i=number.length-1;i>=0;i--) {
		System.out.println(number[i]);
	}
	
}
}
