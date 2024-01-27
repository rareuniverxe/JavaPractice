package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number to whether it is palindrome or not");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int temp = number;
		int reverseNumber = 0;
		while(number>0) {
			reverseNumber = (reverseNumber*10) + number%10;
			number = number/10;
		}
		if(reverseNumber==temp) {
			System.out.println(temp+" - Given number is a palindrome");
		}
	}

}
