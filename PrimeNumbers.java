package primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
// WHETHER A NUMBER IS PRIME OR NOT
	public static void main(String[] args) {
		int num = 97; int count = 0;
		for(int i =1; i<=5; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println(num+" is not a prime");
		}else {			
			System.out.println(num+" is a prime");
		}
	}
// PRIME NUMBER BETWEEN TWO NUMBERS
//	public static void main(String[] args) {
//		System.out.println("Enter the first number");
//		Scanner scanner = new Scanner(System.in);
//		int start = scanner.nextInt();
//		System.out.println("Enter the last number");
//		int end = scanner.nextInt();
//		for(int i = start; i<=end; i++) {
//			int count=0;
//			for(int j=2; j<=end; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count<2) {
//				System.out.print(i+" ");
//			}
//		}
//	}
}
