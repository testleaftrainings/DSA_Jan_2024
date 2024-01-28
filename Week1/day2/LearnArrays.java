package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		
		
		//To get the size of an Array
		int len = numbers.length;
		//print length
		System.out.println("Length "+len);
		//print Array values directly by using Arrays.toString()
		System.out.println(Arrays.toString(numbers));
		
		//Print each values in given array
		for (int i = 0; i <len; i++) {
			System.out.println(numbers[i]);
		}
		            //6 --0-->5
		             //6-1
		//print descending order
		for (int i = numbers.length-1;i>=0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
