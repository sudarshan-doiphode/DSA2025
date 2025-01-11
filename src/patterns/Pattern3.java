package patterns;

/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

public class Pattern3 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            int num = 1;
            for (int col = 0; col <= row ; col++) {
                System.out.print(num +" ");
                ++num;
            }
            System.out.println();
        }
    }
}
