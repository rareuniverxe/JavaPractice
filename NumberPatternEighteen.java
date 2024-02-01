public class NumberPatternEighteen {
    public void numberPatternEighteen() {
        for (int i = 1; i < 10; i++) {
            int num=i;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num += 8-j;
            }
            System.out.println();
        }
    }
}
