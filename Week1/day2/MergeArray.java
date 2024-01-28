package week1.day2;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		//initialize an Array
		int[] num1= {1,2,3,4};
		
		int[] num2= {5,6,7,8};
		
		
		int[] mergeArray=new int[num1.length+num2.length];
		
		//iterate the values from num1. and add to mergeArray
		for (int i = 0; i < num1.length; i++) {
			mergeArray[i]=num1[i];
			
		}
		System.out.println(Arrays.toString(mergeArray));
		
		//iterate the values from num2. and add to mergeArray
		for (int i = 0; i < num2.length; i++) {
			mergeArray[i+num1.length]=num2[i];
		}
		System.out.println(Arrays.toString(mergeArray));
	}
}
