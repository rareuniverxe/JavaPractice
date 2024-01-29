public class RightPascalsTriangle {
    public void rightPascalsTriangle() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
