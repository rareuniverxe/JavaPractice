public class ReversePyramidStarPattern {
    public void reversePyramidStarPattern() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 8-i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
