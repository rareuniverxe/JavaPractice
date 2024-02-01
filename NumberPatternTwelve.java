public class NumberPatternTwelve {
    public void numberPatternTwelve() {
        for (int i = 1; i < 10; i++) {
            int num=9;
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
