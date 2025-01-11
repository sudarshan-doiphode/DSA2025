package patterns;

/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

public class Pattern4 {
    public static void main(String[] args) {
        int num = 1;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col <= row ; col++) {
                System.out.print(num +" ");
            }
            ++num;
            System.out.println();
        }
    }
}
