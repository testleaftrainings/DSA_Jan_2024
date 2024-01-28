package week1.day2;

public class PrintDuplicateNumbers{
	public static void main(String[] args){
		//Initialize an Array
		int[] num={1,5,2,3,7,3,1,2};

		//Iterate the values from o to num length
		for(int i=0;i<num.length;i++){
			//put j=i+1 and check if conditions has match
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					System.out.println(num[i]);
				}
			}
		}
	}
}
