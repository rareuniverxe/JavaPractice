import java.util.Scanner;

public class ReverseNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.print("Enter a number to reverse it: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverseNumber(num);
    }
    public static void reverseNumber(int number) {
        if(number<10) {
            System.out.println(number);
        }
        else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }
}
