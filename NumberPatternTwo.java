public class NumberPatternTwo {
    public void numberPatternTwo() {
        int k=1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
