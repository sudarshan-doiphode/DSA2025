package patterns;

/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

*/

public class Pattern10 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(4);
    }

    private static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n){
        int c = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            c-=1;
            System.out.println();
        }
    }
}
