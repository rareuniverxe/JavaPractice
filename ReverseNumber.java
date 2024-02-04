public class ReverseNumber {
    public static void main(String[] args) {
    int number = 987654;
    int reverse = 0;
    while(number!=0) {
        int reminder = number%10;
        reverse = reverse*10+reminder;
        number=number/10;
    }
    System.out.println(reverse);
//
//        reverse a number using a for loop
//        for (; number != 0; number=number/10) {
//            int reminder = number%10;
//            reverse = reverse*10+reminder;
//        }
//        System.out.println(reverse);
    }
}