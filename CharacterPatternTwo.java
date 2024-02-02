public class CharacterPatternTwo {
    public void characterPatternTwo() {
        for (int i = 0; i < 10; i++) {
            int alpabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(alpabet+ i)+ " ");
            }
            System.out.println();
        }
    }
}
