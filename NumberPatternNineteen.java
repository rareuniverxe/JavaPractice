public class NumberPatternNineteen {
    public void numberPatternNineteen() {
        for (int i = 1; i < 10; i++) {
            int num=i;
            for (int j = 0; j < 10-i; j++) {
                System.out.print(num+" ");
                num++;
            }
            num = 1;
            for (int j = 1; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
