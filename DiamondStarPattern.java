public class DiamondStarPattern {
    public void diamondStarPattern() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 15; j >= 0; j--) {
                if(i==j || i+j==15) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 15; j++) {
                if(i==j || i+j==15) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
