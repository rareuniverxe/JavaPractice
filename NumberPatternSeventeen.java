public class NumberPatternSeventeen {
    public void numberPatternSeventeen() {
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 8-i; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
