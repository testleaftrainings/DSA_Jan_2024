package week1.day2;

public class FindMissingNumber{
	public static void main(String[] args){

		//Initialize an Array
		int[] num={1,2,3,4,5,7,8};
		//missing number is 6
		//Iterate the values from given Array
		for(int i=0; i<num.length;i++){
			//If it is match, The missing number will print
			if(num[i]!=i+1){
				System.out.println(i+1);
				break;
			}
		}
	}
}