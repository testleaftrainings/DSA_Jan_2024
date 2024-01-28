package week1.day2;

import java.util.Arrays;

public class PrintSeconLargestNumber {
public static void main(String[] args) {
	
	//initialize an Array
	int[] num= {9,8,5,2,1,4,3,6,7};
	
	
	//to sort the given Array by using Arrrays.sort()
	Arrays.sort(num);
	//itearte the values using for loop
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	//To print SecondLargest number
	System.out.println(num.length);
	
	                      //9-2 =7 index values 
	System.out.println(num[num.length-2]);
	
}
}
