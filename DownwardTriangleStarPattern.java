public class DownwardTriangleStarPattern {
    public void downwardTriangleStarPattern() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
