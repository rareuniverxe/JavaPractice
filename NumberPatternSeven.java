public class NumberPatternSeven {
    public void numberPatternSeven() {
        for (int i = 1; i < 9; i++) {
            int number = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number--;
            }
            System.out.println();
        }
    }
}
