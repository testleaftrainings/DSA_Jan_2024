package week1.day2;

public class PrimeNumber2 {
public static void main(String[] args) {
	
	int num=11;
	boolean flag=false;
	for (int i = 2; i <=num-1; i++) {
		if(num%i==0) {
			flag=true;
		}
	}
	if(!flag) {
		System.out.println(" The given number is prime number");
	}else {
		System.out.println(" The given number is not prime number");
	}
}
}
