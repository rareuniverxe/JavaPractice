public class NumberPatternFifteen {
    public void numberPatternFifteen() {
        for (int i = 1; i < 10; i++) {
            int num=1;
            for (int j = 1; j < 11-i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for (int i = 1; i < 9; i++) {
            int num=1;
            for (int j = 1; j <= i+1; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
