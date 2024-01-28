package week1.day2;

public class PrintUniqueNumbers {
public static void main(String[] args) {
	
	int[] values={1,2,3,4,5,6,7,8,1,2,3};
//   output : 1,2,3,4,5,6,7,8
	
	for (int i = 0; i < values.length; i++) {
		//initialize  temp variable as count
		int count=1;
		for (int j = i+1; j < values.length; j++) {
			if(values[i]==values[j]) {
				
				//System.out.println(values[i]);
				values[j]=999;
				//System.out.println(values[j]);
			}
			
		}
		if(count>=1  && values[i]!=999 ) {
			System.out.println(values[i]);
		}
	}
	
	
}
}
