public class NumberPatternNine {
    public void numberPatternNine() {
        for (int i = 0; i < 9; i++) {
            int num=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = (num==1)?0:1;
            }
            System.out.println();
        }
    }
}
