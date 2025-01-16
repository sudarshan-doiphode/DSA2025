package patterns;

/*

 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

*/
public class Pattern19 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
    }

    private static void pattern1(int n) {
        int temp = n;
        int stars = 0;
        for (int i = 0; i < 5; i++) {
            //star
            for (int j = temp - i; j > 0; j--) {
                System.out.print("*");
            }

            //space
            for (int j = 0; j < stars; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = temp - i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
            stars += 2;
        }
    }

    private static void pattern2(int n){
        int space=8;
        int temp = 1;
        for (int i = 0; i < 5; i++) {
            //star
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
}
