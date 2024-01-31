public class DownTrianglePattern {
    public void downTrianglePattern() {
        {
            int i, j;
            for (i=9; i>= 1 ; i--)
            {
                for (j = i; j<9 ; j++)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= (2*i -1) ;j++)
                {
                    if( j==1 || i == 9 || j==(2*i-1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
//        for (int i = 9; i >0; i--) {
//            for (int j = 2*i-1; j >0 ; j--) {
//                if (i == 9) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//            for (int j = 2*i-1; j >0 ; j--) {
//                if(((i == j) || j = (2 * i) - 1)) {
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
        }
//        for (int i = 9; i >= 1; i--) {
//            for (int j = (2 * i) - 1; j >= 1; j--) {
//                if (i == j || i + j == 10 || j==1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public void downTrianglePattern() {
//        for (int i = 9; i >= 1; i--) {
//            for (int j = (2*i)-1; j >= 1; j--) {
//                if(i==j || j+i==10) {
//                    System.out.print(" *");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
}

