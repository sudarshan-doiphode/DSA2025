package patterns;

/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
*/
public class Pattern20 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(4);
    }

    private static void pattern1(int n){
        int space = 8;
        for (int i = 0; i < n; i++) {
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

    private static void pattern2(int n){
        int space=2;
        int temp = 4;
        for (int i = 0; i < n; i++) {
            //star
            for (int j = 0; j < temp; j++) {
                System.out.print("*");
            }
            
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            //star
            for (int j = 0; j < temp; j++) {
                System.out.print("*");
            }

            System.out.println();
            space+=2;
            temp-=1;
        }
    }
}
