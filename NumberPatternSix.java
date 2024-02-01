public class NumberPatternSix {
    public void numberPatternSix() {
        for (int i = 8; i > 0; i--) {
            int number = 8;
            for (int j = 0; j < 9-i; j++) {
                System.out.print(number+" ");
                number--;
            }
            System.out.println();
        }
    }
}
