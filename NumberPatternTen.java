public class NumberPatternTen {
    public void numberPatternTen() {
        for (int i = 1; i <= 10; i++) {
            int num = i;
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        for (int i = 9; i > 0; i--) {
            int num = i;
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}