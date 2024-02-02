public class CharacterPatternFour {
    public void CharacterPatternFour() {
        for (int i = 0; i < 9; i++) {
            int alpha = 65;
            for (int j = 0; j < 8-i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j > 9-i; j--) {
                System.out.print((char)(alpha)+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}
