public class App {
    public static void main(String[] args) throws Exception {
        int[] Squarednums = new int[10];
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            Squarednums[count] = i*i;
            System.out.println(Squarednums[count]);
            count++;
        }
    }
}
