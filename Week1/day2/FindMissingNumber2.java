package week1.day2;

public class FindMissingNumber2{
	public static void main(String[] args){

		//Initialize an Array
		int[] num={1,2,3,4,5,7,6,9};
		//missing number is 6
			//Initialize temp variable as sum1
		int sum1=0;
		
		for (int i = 1; i <=9; i++) {
			
			sum1=sum1+i;
		}
		
		System.out.println(sum1);
		
		int sum2=0;
		for (int i = 0; i < num.length; i++) {
			sum2=sum2+num[i];
		}
		System.out.println(sum2);
		
		int sum3=sum1-sum2;
		System.out.println("Missing element "+sum3);
		
		
		
	}
}