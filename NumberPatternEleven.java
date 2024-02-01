public class NumberPatternEleven {
    public void numberPatternEleven() {
        for (int i = 1; i <= 8; i++) {
            int num=1;
            for (int j = 0; j < i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for (int i = 1; i <= 8; i++) {
            int num=1;
            for (int j = 1; j <= 8-i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
