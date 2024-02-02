public class CharacterPatternThree {
    public void characterPatternThree() {
        for (int i = 0; i < 9; i++) {
            int alphabet=65;
            for (int j = 0; j < 9-i; j++) {
                System.out.print((char)(alphabet+j)+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            int alphabet=65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(alphabet+j)+ " ");
            }
            System.out.println();
        }
    }
}
