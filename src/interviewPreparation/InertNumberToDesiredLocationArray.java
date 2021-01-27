package interviewPreparation;

import java.util.Scanner;

public class InertNumberToDesiredLocationArray {

	public static void main(String[] args) {
		
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Numbers:");
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The Numbers before swap is:");
		
		for(int i:arr) {
			
			System.out.println(i);
		}
		
	     System.out.println("Enter the location:");
		int location=sc.nextInt();
		
		System.out.println("Enter the Value:");
		int value=sc.nextInt();
		
		System.out.println("The Numbers after swap is:");
		
		for(int i=arr.length-1;i>location;i--) {
			
			arr[i]=arr[i-1];
		}
		
		arr[location]=value;
		
		for(int j:arr) {
			
			System.out.println(j);
		}

	}

}
