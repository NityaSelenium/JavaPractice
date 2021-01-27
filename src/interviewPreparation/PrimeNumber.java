package interviewPreparation;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not prime number");
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
