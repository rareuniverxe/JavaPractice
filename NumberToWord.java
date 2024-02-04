import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class NumberToWords {

    private static final Map<Integer, String> onesMap = new HashMap<>();
    private static final Map<Integer, String> teensMap = new HashMap<>();
    private static final Map<Integer, String> tensMap = new HashMap<>();
    private static final String[] scales = {"", "thousand", "million", "billion", "trillion"};

    static {
        onesMap.put(0, "");
        onesMap.put(1, "one");
        onesMap.put(2, "two");
        onesMap.put(3, "three");
        onesMap.put(4, "four");
        onesMap.put(5, "five");
        onesMap.put(6, "six");
        onesMap.put(7, "seven");
        onesMap.put(8, "eight");
        onesMap.put(9, "nine");

        teensMap.put(10, "ten");
        teensMap.put(11, "eleven");
        teensMap.put(12, "twelve");
        teensMap.put(13, "thirteen");
        teensMap.put(14, "fourteen");
        teensMap.put(15, "fifteen");
        teensMap.put(16, "sixteen");
        teensMap.put(17, "seventeen");
        teensMap.put(18, "eighteen");
        teensMap.put(19, "nineteen");

        tensMap.put(2, "twenty");
        tensMap.put(3, "thirty");
        tensMap.put(4, "forty");
        tensMap.put(5, "fifty");
        tensMap.put(6, "sixty");
        tensMap.put(7, "seventy");
        tensMap.put(8, "eighty");
        tensMap.put(9, "ninety");
    }

    public static String numberToWords(long num) {
        if (num == 0) {
            return "zero";
        }

        if (num < 0) {
            return "negative " + numberToWords(-num);
        }

        String word = "";
        int scaleCount = 0;

        while (num > 0) {
            long threeDigits = num % 1000;
            if (threeDigits > 0) {  // Check if threeDigits is zero before concatenation
                word = _numberToWordsHelper((int) threeDigits) + scales[scaleCount] + " " + word;
            }
            scaleCount++;
            num /= 1000;
        }

        return word.trim();
    }

    private static String _numberToWordsHelper(int num) {
        String word = "";

        if (num >= 100) {
            word += onesMap.get(num / 100) + " hundred ";
            num %= 100;
        }

        if (num >= 10 && num < 20) {
            word += teensMap.get(num);
        } else if (num >= 20) {
            word += tensMap.get(num / 10) + " ";
            num %= 10;
        }

        if (num > 0 && num < 10) {  // Adjusted condition to handle exactly 10
            word += onesMap.get(num);
        }

        return word;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = scanner.nextLong();

        String words = numberToWords(num);
        System.out.println(words); // No need for trim() here as word is already trimmed
    }
}
