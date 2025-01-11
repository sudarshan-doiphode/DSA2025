package patterns;

/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

public class Pattern6 {
    public static void main(String[] args) {
        int num = 5;
        for (int row = 0; row < 5; row++) {
            int n = 1;
            for (int col = 1; col <= num-row; col++) {
                System.out.print(n +" ");
                ++n;
            }
            System.out.println();
        }
    }
}
