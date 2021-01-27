package interviewPreparation;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num=sc.nextInt();
		
		if(isPrime(num)) {
			
			System.out.println("Its Prime Number");
		}else {
			System.out.println("Its not Prime Number");
		}
		

	}
	
	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

}
