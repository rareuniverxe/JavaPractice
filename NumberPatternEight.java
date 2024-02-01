public class NumberPatternEight {
    public void numberPatternEight() {
        for (int i = 0; i < 10; i++) {
                int num;
                if(i%2==0) {
                    num = 0;
                    for (int j = 0; j < 10; j++) {
                        System.out.print(num);
                        num = (num==0) ? 1 : 0;
                }
                    System.out.println();
            }
                else {
                    num = 1;
                        for (int j = 0; j < 10; j++) {
                            System.out.print(num);
                            num = (num==1) ? 0 : 1;
                        }
                        System.out.println();
                    }
                }
        }
    }
