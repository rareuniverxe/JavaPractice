// Write a program to store 6 subject marks and print sum and average

class SumOfMarks{
    public static void main(String[] args) {
        int[] marks = {89, 95, 99, 90, 97, 99}; //marks hardcoded
        //print sum
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum+marks[i];
        }
        System.out.println("Sum of marks = " +sum);
        //Average
        System.out.println("Average of the marks = "+sum/6);
    }
}
// Write a program to store the following numbers in an array and display output
// i/p-→>12345678
// 0/p 4 3 2 1 8765
class Sorting{
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        for (int i = numbers.length/2; i > 0; i--) {
            System.out.print(numbers[i-1]+" ");
        }
        for (int i = numbers.length; i > numbers.length/2; i--) {
            System.out.print(numbers[i-1]+" ");
        }
    }
}
// Write a program to store the following numbers and find the sum of the values at odd index.
// i/p -→> 100 200 300 400 500 600 700 800
// 0/p -→> 200+400+600+800

class SumOfOdd{
    public static void main(String[] args) {
        int[] numbers = {100,200,300,400,500,600,700,800};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(i%2!=0){
                sum = sum+numbers[i];
            }
        }
        System.out.println("Sum of Odd values = "+ sum);
    }
}
