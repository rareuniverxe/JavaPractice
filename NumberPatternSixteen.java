public class NumberPatternSixteen {
    public void numberPatternSixteen() {
        for (int i = 1; i < 10; i++) {
            int num=i;
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for (int i = 9; i > 0; i--) {
            int num=i;
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 9; j >= i; j--) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
