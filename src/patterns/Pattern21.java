package patterns;

/*

 ****
 *  *
 *  *
 ****

*/
public class Pattern21 {
    public static void main(String[] args) {
        pattern1(2);
        pattern2(2);
    }
    
    private static void pattern1(int n){
        int space = 0;
        for (int i = 0; i < n; i++) {
            //star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            
            //space
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            
            //star
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space+=2;
        }
    }
    
    private static void pattern2(int n){
        int temp = 0;
        int space = 2;
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
}
